package com.ramazan;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by ramazan on 6.04.2017.
 */
public class CustomerServiceTest {
    CustomerService customerService;
    BilgilendirmeService bilgilendirmeService;
    //    CustomerRepository customerRepository;
    CustomerReporsitoryStub reporsitoryStub= new CustomerReporsitoryStub();

    @Before
    public void setUp() {

        customerService = new CustomerService();
        // bilgilendirmeService = new BilgilendirmeService();
        bilgilendirmeService = Mockito.mock(BilgilendirmeService.class);
        //customerRepository = new CustomerRepository();
        //customerRepository = Mockito.mock(CustomerRepository.class);
        //customerService.setCustomerRepository(customerRepository);
        //reporsitoryStub = new CustomerReporsitoryStub();
        customerService.setCustomerRepository(reporsitoryStub);
        customerService.setBilgilendirmeService(bilgilendirmeService);
    }

    @After
    public void tearDown() throws Exception {
        reporsitoryStub.deleteAll();
    }

    @Test
    public void testCustomerSave() {

        //Customer customer = new Customer();
        Customer customer = new Customer(1234);
        customerService.saveCustomer(customer);

        //Mockito.verify(customerRepository).kaydet(customer);
        //assertNotNull(reporsitoryStub.find(customer.getId()));
        assertEquals(customer, reporsitoryStub.find(customer.getId()));
        // assertTrue(reporsitoryStub.getCustomerMap().containsValue(customer));
        Mockito.verify(bilgilendirmeService).emailGonder(customer);

    }

    @Test
    public void testDeleteCustomer() throws Exception {
        customerService.saveCustomer(new Customer(123));

        customerService.deleteCustomer(123);

        assertNull(reporsitoryStub.find(123));
    }
}
