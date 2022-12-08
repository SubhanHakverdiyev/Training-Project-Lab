package com.example.tenniscourtbooking;

import javax.inject.Inject;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;


@Controller
public class ScheduleController {

    @Inject
    private  ScheduleService scheduleService;

    @GetMapping(value = "/schedule")
    public String getSchedule(Model model) {
        ScheduleRequest scheduleRequest = new ScheduleRequest();
        model.addAttribute("schedule", scheduleRequest);
        return "schedule";
    }


//    @GetMapping("/listSchedules")
//    public CourtSchedule courtSchedule(@RequestParam(value = "name") String name) {
//       return new CourtSchedule(courtRepository.getScheduleList().get(0).getId(), courtRepository.getScheduleList().get(0).getName(),
//               courtRepository.getScheduleList().get(0).getDate(), courtRepository.getScheduleList().get(0).getCourtNumber());
//    }

    @PostMapping(value="/schedule/save")
    public String schedule(@ModelAttribute("schedule") ScheduleRequest scheduleRequest, Model model){
           System.out.println(scheduleRequest.getType());
            scheduleService.create(scheduleRequest);

            return "redirect:/payment";
    }





}
  //   curl -i -H "Content-Type: application/json" -X POST -d "{\"name\": \"subhan\", \"date\": \"03/11/2022\", \"courtNumber\": \"2\"}" http://localhost:8080/schedule
//curl -i -H "Content-Type: application/json" -X POST -d "{\"name\": \"Subhan\"}" http://localhost:8080/schedule