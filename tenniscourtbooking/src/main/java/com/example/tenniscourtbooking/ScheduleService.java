package com.example.tenniscourtbooking;

import javax.inject.Inject;

import org.springframework.stereotype.Service;


@Service
public class ScheduleService {

    @Inject
    CourtRepository courtRepository;

    public void  create(ScheduleRequest scheduleRequest){
            CourtSchedule courtSchedule = new CourtSchedule();
            courtSchedule.setEmail(scheduleRequest.getEmail());
            courtSchedule.setDate(scheduleRequest.getDate());
            courtSchedule.setCourtNumber(scheduleRequest.getCourtNumber());
            courtSchedule.setType(scheduleRequest.getType());
            courtRepository.save(courtSchedule);

    }
}
