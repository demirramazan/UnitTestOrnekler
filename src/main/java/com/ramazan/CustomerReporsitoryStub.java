package com.ramazan;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ramazan on 7.04.2017.
 */
public class CustomerReporsitoryStub extends CustomerRepository {

    private Map<Integer, Customer> customerMap = new HashMap<Integer, Customer>();

    @Override
    public void kaydet(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public void delete(Integer customerId) {
        customerMap.remove(customerId);
    }

    @Override
    public Customer find(Integer customerId) {
        return customerMap.get(customerId);
    }

    public Map<Integer, Customer> getCustomerMap() {
        return customerMap;
    }

    public void deleteAll() {
        customerMap.clear();
    }
}
