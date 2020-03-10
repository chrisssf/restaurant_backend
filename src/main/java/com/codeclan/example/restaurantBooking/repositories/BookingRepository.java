package com.codeclan.example.restaurantBooking.repositories;

import com.codeclan.example.restaurantBooking.models.Booking;
import com.codeclan.example.restaurantBooking.projections.EmbedCustomerAndEatingPlatform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@RepositoryRestResource
@RepositoryRestResource(excerptProjection = EmbedCustomerAndEatingPlatform.class)
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    List<Booking> findBookingsByDate(String date);
}
