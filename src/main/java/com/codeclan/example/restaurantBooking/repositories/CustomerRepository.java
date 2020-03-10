package com.codeclan.example.restaurantBooking.repositories;

import com.codeclan.example.restaurantBooking.models.Customer;
import com.codeclan.example.restaurantBooking.projections.EmbedCustomerAndEatingPlatform;
import com.codeclan.example.restaurantBooking.projections.EmbedCustomerId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCustomerId.class)
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findCustomersById(Long id);

}
