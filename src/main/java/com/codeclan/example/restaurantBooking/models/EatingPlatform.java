package com.codeclan.example.restaurantBooking.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tables")
public class EatingPlatform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_of_seats")
    private int numberOfSeats;

    @OneToMany(mappedBy = "eatingPlatform", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public EatingPlatform(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        this.bookings = new ArrayList<Booking>();
    }

    public EatingPlatform() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
    public void addBooking(Booking booking){
        this.bookings.add(booking);
    }
}
