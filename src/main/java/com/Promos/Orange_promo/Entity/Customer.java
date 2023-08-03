package com.Promos.Orange_promo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Column;

@Entity
public class Customer {

        @Column(name = "Msisdn")
        private int msisdn;

        @Column(name = "Id")
        private Long id;


        public Customer(){

        }

        public Customer(Long id,int msisdn){
            this.id=id;
            this.msisdn=msisdn;
        }

        public void setId(long Id) {
            id = Id;

         }


        public long getId() {
            return id;
        }

        @Id
        public int getMsisdn() {
            return msisdn;
        }

        public void setMsisdn(int msisdn) {
           this. msisdn = msisdn;
        }





}
