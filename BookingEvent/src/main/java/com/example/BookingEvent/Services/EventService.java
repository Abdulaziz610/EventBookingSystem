package com.example.BookingEvent.Services;


import com.example.BookingEvent.RequestObject.EventRequest;
import com.example.BookingEvent.Repository.EventRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data

public class EventService {
    @Autowired
    static
    EventRepo  eventRepo;


    public List<EventRequest> ListOfAllEvents(){
        return eventRepo.findAll();
    }

    public static Optional<EventRequest> getEvent(Long eventId) {
        return eventRepo.findById(eventId);
    }

}
