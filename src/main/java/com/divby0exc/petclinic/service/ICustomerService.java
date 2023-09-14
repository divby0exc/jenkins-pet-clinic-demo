package com.divby0exc.petclinic.service;

import com.divby0exc.petclinic.model.Customer;

import java.util.List;

public interface ICustomerService {
    Customer saveCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomer(String name);

    Customer updateCustomer(String name);


}
