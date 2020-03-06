package com.codeclan.example.restaurantBooking.models;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name= "start_time")
    private Time startTime;

    @Column(name = "duration")
    private int duration;

    @ManyToOne
    @JoinColumn(name = "table_id", nullable = false)
    private EatingPlatform eatingPlatform;

    @Column(name = "number_of_guests")
    private int numberOfGuests;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public Booking(Date date, Time startTime, EatingPlatform eatingPlatform, int numberOfGuests, Customer customer) {
        this.date = date;
        this.startTime = startTime;
        this.duration = 1;
        this.eatingPlatform = eatingPlatform;
        this.numberOfGuests = numberOfGuests;
        this.customer = customer;
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public EatingPlatform getEatingPlatform() {
        return eatingPlatform;
    }

    public void setEatingPlatform(EatingPlatform eatingPlatform) {
        this.eatingPlatform = eatingPlatform;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
