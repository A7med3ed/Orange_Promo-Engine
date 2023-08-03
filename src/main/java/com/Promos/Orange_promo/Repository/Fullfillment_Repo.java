package com.Promos.Orange_promo.Repository;


import com.Promos.Orange_promo.Entity.Fullfillment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface Fullfillment_Repo extends CrudRepository<Fullfillment,Long> {
ArrayList<Fullfillment> findByMsisdn(Long Mis);
}
