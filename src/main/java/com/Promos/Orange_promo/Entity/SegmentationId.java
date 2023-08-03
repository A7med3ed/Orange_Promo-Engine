package com.Promos.Orange_promo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SegmentationId implements Serializable {
    @Column(name = "Msisdn")
    private Long msisdn;

    @Column(name = "Segment")
    private Integer segment;

    public SegmentationId() {

    }

    public SegmentationId(Long msisdn, Integer segment) {
        this.msisdn = msisdn;
        this.segment = segment;
    }


    public Long getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(Long msisdn) {
        this.msisdn = msisdn;
    }

    public Integer getSegment() {
        return segment;
    }

    public void setSegment(Integer segment) {
        this.segment = segment;
    }
}
