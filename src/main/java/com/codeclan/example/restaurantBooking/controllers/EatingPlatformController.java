package com.codeclan.example.restaurantBooking.controllers;

import com.codeclan.example.restaurantBooking.repositories.EatingPlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tables")
public class EatingPlatformController {

    @Autowired
    EatingPlatformRepository eatingPlatformRepository;
}
