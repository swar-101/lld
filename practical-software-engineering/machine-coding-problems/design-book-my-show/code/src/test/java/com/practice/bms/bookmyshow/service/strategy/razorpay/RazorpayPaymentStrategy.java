package com.practice.bms.bookmyshow.service.strategy.razorpay;

import com.practice.bms.bookmyshow.model.Booking;
import com.practice.bms.bookmyshow.service.strategy.PaymentStrategy;

public class RazorpayPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(Booking booking) {
        System.out.println("Paying via Razorpay Payment Gateway...");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Payment failed! Please try again.");
        }
        System.out.println("Payment via Razorpay succeeded!");
    }
}
