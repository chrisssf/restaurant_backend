package com.codeclan.example.restaurantBooking.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    private String date;

    @Column(name= "start_time")
    private String startTime;

    @Column(name = "duration")
    private int duration;

    @ManyToOne
    @JoinColumn(name = "table_id", nullable = false)
    private EatingPlatform eatingPlatform;

    @Column(name = "number_of_guests")
    private int numberOfGuests;

    @JsonIgnoreProperties("bookings")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "has_arrived")
    private Boolean hasArrived;

    @Column(name = "has_left")
    private Boolean hasLeft;

    public Booking(String date, String startTime, EatingPlatform eatingPlatform, int numberOfGuests, Customer customer) {
        this.date = date;
        this.startTime = startTime;
        this.duration = 1;
        this.eatingPlatform = eatingPlatform;
        this.numberOfGuests = numberOfGuests;
        this.customer = customer;
        this.hasArrived = false;
        this.hasLeft = false;
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
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

    public Boolean getHasArrived() {
        return hasArrived;
    }

    public void setHasArrived(Boolean hasArrived) {
        this.hasArrived = hasArrived;
    }

    public Boolean getHasLeft() {
        return hasLeft;
    }

    public void setHasLeft(Boolean hasLeft) {
        this.hasLeft = hasLeft;
    }

    public Long getEatingPlatformId() {
        return getEatingPlatform().getId();
    }

    public Long getCustomerId(){
        return getCustomer().getId();
    }
}
