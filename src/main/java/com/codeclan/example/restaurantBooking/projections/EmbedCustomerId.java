package com.codeclan.example.restaurantBooking.projections;

import com.codeclan.example.restaurantBooking.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedCustomerId", types = Customer.class)
public interface EmbedCustomerId {

    String getName();
    String getPhoneNumber();
    Long getId();
}
