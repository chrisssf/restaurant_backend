package com.codeclan.example.restaurantBooking.controllers;

import com.codeclan.example.restaurantBooking.models.Customer;
import com.codeclan.example.restaurantBooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/id/{id}")
    public List<Customer> findCustomersById(@PathVariable Long id) {
        return customerRepository.findCustomersById(id);
    }
}
