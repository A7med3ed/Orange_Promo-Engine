package com.Promos.Orange_promo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Entity;


@Entity
public class Fullfillment {


    @Column(name = "Msisdn")
    private Long msisdn;

    @ManyToOne
    @JoinColumn(name = "Msisdn", referencedColumnName = "Msisdn", insertable = false, updatable = false)
    private Customer customer;

    @Column(name = "Id")
    private Long id;

    @Column(name = "OfferId")
    private Long offerId;

    @ManyToOne
    @JoinColumn(name = "OfferId", referencedColumnName = "Id", insertable = false, updatable = false)
    private Offer offer;

    @Column(name = "Status")
    private String status;

    @Column(name = "Date")
    private String date;

    public Fullfillment(){

    }


    public Fullfillment(Long id, Long msisdn, Long offerId, String status, String date) {
        this.id = id;
        this.msisdn=msisdn;
        this.offerId = offerId;
        this.status = status;
        this.date = date;
    }

    public Long getOfferId() {
        return offerId;
    }

    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }
    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(Long msisdn) {
        this.msisdn = msisdn;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }






}



