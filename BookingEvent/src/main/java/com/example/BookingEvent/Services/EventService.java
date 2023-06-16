package com.example.BookingEvent.Services;


import com.example.BookingEvent.Models.EventModel;
import com.example.BookingEvent.Repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EventService {
    @Autowired
    EventRepo  eventRepo;


    List<EventModel> ListOfAllEvents(){
        return eventRepo.findAll();

    }
}
