package com.example.BookingEvent.Controller;


import com.example.BookingEvent.Models.EventModel;
import com.example.BookingEvent.Models.EventRequest;
import com.example.BookingEvent.Repository.EventRepo;
import com.example.BookingEvent.Services.EventService;
import com.sun.java.accessibility.util.EventID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class EventController {
@Autowired
    EventRepo   eventRepo;
@Autowired
    EventService    eventService;

@PostMapping("/EventTable")
    public ResponseEntity<String> newEvent(@RequestBody EventRequest eventRequest){


    //Create a New Event then save it:
    EventModel ReqNewEvent = new EventModel();
    ReqNewEvent.setId(eventRequest.getEventID());
    ReqNewEvent.setEventName(eventRequest.getEventName());
    ReqNewEvent.setEventDate(eventRequest.getEventDate());
    ReqNewEvent.setEventLocation(eventRequest.getEventLocation());
    ReqNewEvent.setNumberOfAvailableTicket(eventRequest.getNumberOfAvailableTicket());

    eventRepo.save(ReqNewEvent);

    //Response message.
    return ResponseEntity.ok(("You Have been created the event successfully"));

    }
}
