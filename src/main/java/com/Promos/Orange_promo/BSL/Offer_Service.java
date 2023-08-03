package com.Promos.Orange_promo.BSL;
import com.Promos.Orange_promo.Entity.Offer;
import com.Promos.Orange_promo.Repository.Offer_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Offer_Service {


    private static Offer_Repo offer = null;

    @Autowired
    public Offer_Service(Offer_Repo offer_repo) {
        offer = offer_repo;
    }



    public Offer SaveOffer(Offer offerr){
        return offer.save(offerr);
    }

    public Optional<Offer>fetchOfferById(Long OfferId) {
        return offer.findById(OfferId);
    }

    public Optional<Offer> findOfferById(Long OfferId) {
        return offer.findById(OfferId);
    }

    public void deleteOfferById(Long OfferId) {
        offer.deleteById(OfferId);
    }


}
