package com.example.tenniscourtbooking;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CourtRepository {

    public List<CourtSchedule> scheduleList = new ArrayList<>();


    public List<CourtSchedule> getScheduleList() {
        return scheduleList;
    }

    public void add(CourtSchedule schedule) {
        scheduleList.add(schedule);
    }


}
