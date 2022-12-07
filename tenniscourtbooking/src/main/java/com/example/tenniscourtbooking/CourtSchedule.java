package com.example.tenniscourtbooking;

import static javax.persistence.GenerationType.SEQUENCE;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "Schedules")

public class CourtSchedule {

    @Id
    @SequenceGenerator(
            name = "schedule_sequence",
            sequenceName = "schedule_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "user_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private String email;

    @Column(
            name = "date",
            nullable = false,
            columnDefinition = "DATE DEFAULT CURRENT_DATE"
    )
    private LocalDate date;
    @Column(
            name = "court_number",
            nullable = false,
            columnDefinition = "integer default 25"
    )
    private int courtNumber;

    @Column(
            name = "court_type",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String type;

    public CourtSchedule(String email, LocalDate date, int courtNumber, String type) {
        this.email = email;
        this.date = date;
        this.courtNumber = courtNumber;
        this.type = type;
    }

    public CourtSchedule(){}

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
