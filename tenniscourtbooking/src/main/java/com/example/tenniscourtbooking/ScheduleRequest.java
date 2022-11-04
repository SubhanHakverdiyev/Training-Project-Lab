package com.example.tenniscourtbooking;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ScheduleRequest {

    private final AtomicLong counter = new AtomicLong();
    private long id = 0;
    private String name;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    private int courtNumber;

    public ScheduleRequest(String name, LocalDate date, int courtNumber) {
        id = counter.incrementAndGet();
        this.name = name;
        this.date = date;
        this.courtNumber  = courtNumber;
    }
    public ScheduleRequest(){
    }

    public Long getId() {
        return id;
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

}
