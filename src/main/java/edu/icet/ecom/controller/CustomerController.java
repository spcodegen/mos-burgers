package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor

public class CustomerController {

    final CustomerService service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @GetMapping("/get-all")
    public List<Customer> getAllCustomer(){
        return service.getAllCustomer();
    }

    @GetMapping("/search-by-id/{id}")
    public Customer searchById(@PathVariable Integer id){
        return service.searchById(id);
    }

    @PostMapping("/update")
    public void updateCustomer(@RequestBody Customer customer){
        service.updateCustomer(customer);
    }


}
