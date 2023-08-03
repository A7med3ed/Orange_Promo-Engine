package com.Promos.Orange_promo.Repository;


import com.Promos.Orange_promo.Entity.Offer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Offer_Repo extends CrudRepository<Offer,Long> {

}
