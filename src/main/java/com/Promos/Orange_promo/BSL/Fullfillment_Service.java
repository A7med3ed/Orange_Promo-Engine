package com.Promos.Orange_promo.BSL;
import com.Promos.Orange_promo.Entity.Fullfillment;
import com.Promos.Orange_promo.Repository.Fullfillment_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class Fullfillment_Service {
        private static Fullfillment_Repo fullfillment = null;

        @Autowired
        public Fullfillment_Service(Fullfillment_Repo fullfillment_repo) {
        fullfillment = fullfillment_repo;
        }

        public Fullfillment SaveFullfillment(Fullfillment full){
            return fullfillment.save(full);
        }

        public Optional<Fullfillment> fetchFullfillmentById(Long FullfillmentId) {
            return fullfillment.findById(FullfillmentId);
        }

        public Optional<Fullfillment> findFullfillmentById(Long FullfillmentId) {
            return fullfillment.findById(FullfillmentId);
        }

        public ArrayList<Fullfillment> findFullfillmentByMsisdn(Long Mis) {
            return fullfillment.findByMsisdn(Mis);
         }

        public void deleteFullfillmentById(Long FullfillmentId) {
            fullfillment.deleteById(FullfillmentId);
        }




}
