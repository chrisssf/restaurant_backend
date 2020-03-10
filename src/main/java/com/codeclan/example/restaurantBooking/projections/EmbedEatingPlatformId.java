package com.codeclan.example.restaurantBooking.projections;

import com.codeclan.example.restaurantBooking.models.EatingPlatform;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedEatingPlatformId", types = EatingPlatform.class)
public interface EmbedEatingPlatformId {

    Long getId();
    int getNumberOfSeats();

}
