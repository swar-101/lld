package com.practice.bms.bookmyshow.model;

import java.util.List;

public class Booking extends BaseModel {

    private User user;
    private Show show;
    private List<ShowSeat> showSeats;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<ShowSeat> getShowSeats() {
        return showSeats;
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }
}