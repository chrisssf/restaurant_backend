package com.codeclan.example.restaurantBooking.components;

import com.apple.eawt.Application;
import com.codeclan.example.restaurantBooking.models.EatingPlatform;
import com.codeclan.example.restaurantBooking.repositories.BookingRepository;
import com.codeclan.example.restaurantBooking.repositories.CustomerRepository;
import com.codeclan.example.restaurantBooking.repositories.EatingPlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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

    }
}
