package com.codeclan.example.restaurantBooking.repositories;

import com.codeclan.example.restaurantBooking.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findCustomersById(Long id);
}
