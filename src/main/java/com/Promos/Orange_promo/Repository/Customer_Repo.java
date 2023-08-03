package com.Promos.Orange_promo.Repository;
import com.Promos.Orange_promo.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer_Repo extends CrudRepository<Customer, Long> {

}
