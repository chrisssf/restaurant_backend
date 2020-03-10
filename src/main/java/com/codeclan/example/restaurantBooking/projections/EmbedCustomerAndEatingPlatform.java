package com.codeclan.example.restaurantBooking.projections;

import com.codeclan.example.restaurantBooking.models.Booking;
import com.codeclan.example.restaurantBooking.models.Customer;
import com.codeclan.example.restaurantBooking.models.EatingPlatform;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedCustomerAndEatingPlatform", types = Booking.class)
public interface EmbedCustomerAndEatingPlatform {

    String getDate();
    String getStartTime();
    int getNumberOfGuests();
    int getDuration();
    Customer getCustomer();
    EatingPlatform getEatingPlatform();
    Boolean getHasArrived();
    Boolean getHasLeft();
    Long getEatingPlatformId();
    Long getCustomerId();

}
