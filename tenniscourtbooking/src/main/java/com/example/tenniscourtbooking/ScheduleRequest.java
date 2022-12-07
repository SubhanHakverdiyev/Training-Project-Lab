package com.example.tenniscourtbooking;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ScheduleRequest {

    private String email;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    private int courtNumber;

    private String type;


    public ScheduleRequest(String email, LocalDate date, int courtNumber, String type) {
        this.email = email;
        this.date = date;
        this.courtNumber  = courtNumber;
        this.type = type;
    }
    public ScheduleRequest(){
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getType(){ return type;}

    public void setType(String type) { this.type = type; }


}
