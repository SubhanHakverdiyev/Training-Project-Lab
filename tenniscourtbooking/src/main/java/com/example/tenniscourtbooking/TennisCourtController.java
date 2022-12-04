package com.example.tenniscourtbooking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TennisCourtController {

    private  ScheduleService scheduleService;
    private CourtRepository courtRepository;

    public TennisCourtController(ScheduleService scheduleService, CourtRepository courtRepository) {
        this.scheduleService = scheduleService;
        this.courtRepository = courtRepository;
    }

    @GetMapping("/listSchedules")
    public CourtSchedule courtSchedule(@RequestParam(value = "name") String name) {
       return new CourtSchedule(courtRepository.getScheduleList().get(0).getId(), courtRepository.getScheduleList().get(0).getName(),
               courtRepository.getScheduleList().get(0).getDate(), courtRepository.getScheduleList().get(0).getCourtNumber());
    }

    @PostMapping(value="/schedule")
    public void schedule(@RequestBody() ScheduleRequest scheduleRequest) {
                scheduleService.create(scheduleRequest);
    }



}
  //   curl -i -H "Content-Type: application/json" -X POST -d "{\"name\": \"subhan\", \"date\": \"03/11/2022\", \"courtNumber\": \"2\"}" http://localhost:8080/schedule
//curl -i -H "Content-Type: application/json" -X POST -d "{\"name\": \"Subhan\"}" http://localhost:8080/schedule