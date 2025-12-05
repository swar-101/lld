package com.practice.bms.bookmyshow.model;

public class Ticket extends BaseModel {
    private Booking booking;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
