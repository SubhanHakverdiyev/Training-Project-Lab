package com.example.tenniscourtbooking;

import java.time.LocalDate;
import java.util.Date;

import javax.inject.Inject;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;


@Service
public class ScheduleService {

    @Inject
    CourtRepository courtRepository;

    public void  create(ScheduleRequest scheduleRequest){
            CourtSchedule courtSchedule = new CourtSchedule(scheduleRequest.getId(),
                    scheduleRequest.getName(), scheduleRequest.getDate(), scheduleRequest.getCourtNumber());
            courtRepository.add(courtSchedule);
            System.out.println(courtRepository.scheduleList);

    }
}
