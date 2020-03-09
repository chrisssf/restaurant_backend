package com.codeclan.example.restaurantBooking.components;

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

        Customer Bob = new Customer("Bob", "55467865414");
        customerRepository.save(Bob);

        Customer Jeff = new Customer("Jeff", "12333212321");
        customerRepository.save(Jeff);


        EatingPlatform Table1 = new EatingPlatform(6);
        eatingPlatformRepository.save(Table1);

        EatingPlatform Table2 = new EatingPlatform(4);
        eatingPlatformRepository.save(Table2);

        EatingPlatform Table3 = new EatingPlatform(8);
        eatingPlatformRepository.save(Table3);


        Booking booking1 = new Booking("2020-06-20", "14:00", Table1,4, Bob);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("2020-06-20", "18:00", Table2,3, Jeff);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("2020-06-10", "20:00", Table3,6, Dave);
        bookingRepository.save(booking3);

    }
}
