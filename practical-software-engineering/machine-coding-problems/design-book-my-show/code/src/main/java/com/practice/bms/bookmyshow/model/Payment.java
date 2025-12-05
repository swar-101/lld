package com.practice.bms.bookmyshow.model;

import com.practice.bms.bookmyshow.service.strategy.PaymentStrategy;

public class Payment extends BaseModel {
    private Ticket ticket;
    private PaymentStatus status;
    private PaymentMode mode;
    private PaymentStrategy strategy;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public PaymentStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}
