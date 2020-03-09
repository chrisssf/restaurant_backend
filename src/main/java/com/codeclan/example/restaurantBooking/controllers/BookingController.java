package com.codeclan.example.restaurantBooking.controllers;

import com.codeclan.example.restaurantBooking.models.Booking;
import com.codeclan.example.restaurantBooking.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> findBookingsByDate(@PathVariable String date) {
        return bookingRepository.findBookingsByDate(date);
    }
}

