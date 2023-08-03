package com.Promos.Orange_promo.Entity;

import org.springframework.stereotype.Component;

@Component
public class Requests {
    private Long msisdn;
    private Long offerId;


    public void setofferId(Long offerid) {
        offerId = offerid;
    }
    public Long getofferId() {
        return offerId;
    }

    public Long getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(Long msisdn) {
        this.msisdn = msisdn;
    }

}
