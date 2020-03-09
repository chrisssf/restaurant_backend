package com.codeclan.example.restaurantBooking.repositories;

import com.codeclan.example.restaurantBooking.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> findBookingsByDate(String date);
}
