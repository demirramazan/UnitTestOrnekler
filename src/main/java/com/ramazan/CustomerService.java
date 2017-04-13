package com.ramazan;

/**
 * Created by ramazan on 6.04.2017.
 */
public class CustomerService {
    private CustomerRepository repository;

    private BilgilendirmeService bilgilendirmeService;

    public void saveCustomer(Customer customer) {
        repository.kaydet(customer);
        bilgilendirmeService.emailGonder(customer);
    }

    public void deleteCustomer(Integer customerId){
        repository.delete(customerId);
    }

    public void setCustomerRepository(CustomerRepository customerRepository){
        this.repository=customerRepository;
    }

    public void setBilgilendirmeService(BilgilendirmeService bilgilendirmeService) {
        this.bilgilendirmeService = bilgilendirmeService;
    }
}
