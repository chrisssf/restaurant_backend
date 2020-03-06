package com.codeclan.example.restaurantBooking.components;

import com.apple.eawt.Application;
import com.codeclan.example.restaurantBooking.models.Booking;
import com.codeclan.example.restaurantBooking.models.Customer;
import com.codeclan.example.restaurantBooking.models.EatingPlatform;
import com.codeclan.example.restaurantBooking.repositories.BookingRepository;
import com.codeclan.example.restaurantBooking.repositories.CustomerRepository;
import com.codeclan.example.restaurantBooking.repositories.EatingPlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    EatingPlatformRepository eatingPlatformRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args){

        Customer Dave = new Customer("Dave", "12345678901");
        customerRepository.save(Dave);

        EatingPlatform Table1 = new EatingPlatform(6);
        eatingPlatformRepository.save(Table1);

        Booking booking1 = new Booking("2020-06-20", "14:00", Table1,4, Dave);
        bookingRepository.save(booking1);

    }
}
