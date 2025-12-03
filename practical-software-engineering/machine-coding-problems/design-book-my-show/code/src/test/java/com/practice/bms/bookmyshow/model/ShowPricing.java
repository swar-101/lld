package com.practice.bms.bookmyshow.model;

public class ShowPricing extends BaseModel {
    private SeatType seatType;
    private int price;

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
