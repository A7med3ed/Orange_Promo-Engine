package com.Promos.Orange_promo.BSL;
import com.Promos.Orange_promo.Entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalTime;
import java.util.ArrayList;


@Service
public class Promo_BL {
        private final Requests Req;
        private Customer Cus;

        private final Customer_Service customer_Service;

        private final Segmentation_Service segmentation_Service;

        private final Fullfillment_Service  fullfillment_Service;

        ArrayList<Segmentation> segments = new ArrayList<>();
        ArrayList<Fullfillment> Fullfilled = new ArrayList<>();
        ArrayList<Integer> SegId = new ArrayList<>();
        private final Logger logger = LoggerFactory.getLogger(Promo_BL.class);

        @Autowired
        public Promo_BL(Requests req, Customer_Service customerService, Segmentation_Service segmentation_service, Fullfillment_Service fullfillment_service) {
            Req = req;
            this.customer_Service = customerService;
            this.segmentation_Service = segmentation_service;
            this.fullfillment_Service = fullfillment_service;
        }



        public void getPromoRequest(Long msisdn, Long offerId) {
            Req.setofferId(offerId);
            Req.setMsisdn(msisdn);
            logger.info(Req.getMsisdn()+" "+Req.getofferId());

        }



        public Boolean IsCustomer(Long msisdn) {
            Cus= customer_Service.fetchCustomerById(msisdn);
            if (Cus!=null){
                return true;
            }

            logger.info("NOT CUSTOMER");
            return false;
        }



        public boolean IsSegmented(Long msisdn) {
           segments.clear();
           segments=segmentation_Service .findSegmentationByMsisdn(msisdn);

            if(segments.size()>0) {
                for(int i=0;i<segments.size();i++){
                    SegId.add(segments.get(i).getId().getSegment());
                }

                return true;
            }

            return false;
        }



        public Boolean IsAvailable(Long offerId) {
            segments.clear();
            segments=segmentation_Service .findSegmentationByOfferId(offerId);

            for(int i=0;i<SegId.size();i++) {
                int Sid=SegId.get(i);
                for(int j=0;j<segments.size();j++){
                    if(Sid==segments.get(i).getId().getSegment()){
                        SegId.clear();
                        return true;
                    }


                }

            }
            SegId.clear();
            return false;
        }



        public Boolean IsFullfilled(Long msisdn, Long offerId) {
            Fullfilled=fullfillment_Service.findFullfillmentByMsisdn(msisdn);


            for(int i=0;i<Fullfilled.size();i++){
                if(Fullfilled.get(i).getOfferId()==offerId){
                    return false;
                }

            }

            LocalTime currentTime = LocalTime.now();
            int id = 0;
            Fullfillment fill=new Fullfillment((long)id,msisdn,offerId,"redeemed",""+currentTime);
            fullfillment_Service.SaveFullfillment(fill);
            return true;
        }


        public String Flow(Long msisdn, Long offerId){
            ArrayList<Integer> Temp_Seg = new ArrayList<>();
            getPromoRequest(msisdn, offerId);
            if (IsCustomer(msisdn)){
                logger.info("customer found");

                if(IsSegmented(msisdn)){
                    logger.info("customer segmented");

                    if(IsAvailable(offerId)){
                        logger.info("offer available");
                        if(!IsFullfilled(msisdn,offerId)){

                            return "Gift already redeemed.";
                        }
                        else{return "Gift is successfully redeemed";}
                    }

                    else {
                        return "offer Not available .";
                     }

                }

                else{return "offer Not available .";}


            }

            else {
                return "offer Not available .";
            }

        }






}
