package com.practice.bms.bookmyshow.model;

import java.time.LocalDateTime;
import java.util.List;

public class Show extends BaseModel {
    private Screen screen;
    private Movie movie;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Feature feature;
    private List<ShowPricing> pricingList;
}
