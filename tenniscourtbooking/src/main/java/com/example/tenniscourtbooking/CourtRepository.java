package com.example.tenniscourtbooking;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.tenniscourtbooking.Authentication.User;

@Component
public interface CourtRepository  extends JpaRepository<CourtSchedule,Long> {

}
