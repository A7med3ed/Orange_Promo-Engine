package com.Promos.Orange_promo.BSL;
import com.Promos.Orange_promo.Entity.Customer;
import com.Promos.Orange_promo.Repository.Customer_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Customer_Service {


    private static Customer_Repo customer = null;

    @Autowired
    public Customer_Service(Customer_Repo customerRepo) {
        this.customer = customerRepo;
    }


    public Customer SaveCustomer(Customer Cust){
        return customer.save(Cust);
    }

    public  Customer fetchCustomerById(Long customerId) {
        Optional<Customer> optionalCustomer = customer.findById(customerId);
        if (optionalCustomer.isPresent()) {
            return optionalCustomer.get();
        }
        return null;
    }

    public Optional<Customer> findCustomerById(Long customerId) {
        return customer.findById(customerId);
    }

    public void deleteCustomerById(Long customerId) {
        customer.deleteById(customerId);
    }


}
