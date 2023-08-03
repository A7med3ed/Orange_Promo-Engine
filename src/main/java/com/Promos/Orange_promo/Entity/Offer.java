package com.Promos.Orange_promo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Offer {

        @Column(name = "Id")
        private Long id;

        @Column(name = "Offer_Value")
        private int offer_Value;

        @Column(name = "Validity")
        private int validity;

        @Column(name = "Type")
        private String type;

        public Offer(){

        }
        public Offer(int offer_value, int validity, String type) {
            offer_Value = offer_value;
            this.validity = validity;
            this.type = type;
        }


        public void setId(Long id) {

            this.id = id;
        }

        @Id
        public Long getId() {
           return id;
          }

        public int getOffer_Value() {
        return offer_Value;
       }

       public void setOffer_Value(int offer_Value) {
        this.offer_Value = offer_Value;
       }

       public int getValidity() {
        return validity;
       }

       public void setValidity(int validity) {
        this.validity = validity;
       }

       public String getType() {
        return type;
       }

       public void setType(String type) {
        this.type = type;
       }
}
