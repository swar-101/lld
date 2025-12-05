package com.practice.bms.bookmyshow.service.strategy;

import com.practice.bms.bookmyshow.model.Booking;

public interface PaymentStrategy {
    void pay(Booking booking);
}