package edu.icet.ecom.service;

import edu.icet.ecom.dto.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);

    List<Customer> getAllCustomer();


    Customer searchById(Integer id);

    void updateCustomer(Customer customer);
}
