package com.ramazan;

/**
 * Created by ramazan on 6.04.2017.
 */
public class CustomerRepository {

    public void kaydet(Customer customer){
        System.out.println("customer is saved...");
    }

    public void delete(Integer customerId){
        System.out.println("customer deleted..");
    }
    public Customer find(Integer customerId){
        System.out.println("customer is find");
        return null;
    }
}
