package com.practice.bms.bookmyshow.model;

public class Seat extends BaseModel {
    private SeatType type;
    private int number;
    private char row;

    public SeatType getType() {
        return type;
    }

    public void setType(SeatType type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }
}
