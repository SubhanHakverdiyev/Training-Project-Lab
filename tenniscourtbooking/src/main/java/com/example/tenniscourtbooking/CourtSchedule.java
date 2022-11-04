package com.example.tenniscourtbooking;

import java.time.LocalDate;
import java.util.Date;

public class CourtSchedule {

    private final Long id;

    private String name;

    private LocalDate date;

    private int courtNumber;

    public CourtSchedule(Long id,String name, LocalDate date, int courtNumber) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.courtNumber = courtNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getCourtNumber() {
        return courtNumber;
    }

    public void setCourtNumber(int courtNumber) {
        this.courtNumber = courtNumber;
    }

    public Long getId() {
        return id;
    }
}
