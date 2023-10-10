package com.example.application.data;

import java.util.ArrayList;
import java.util.List;

public class CarRentalData {

    private List<Customer> customers = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();


    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
