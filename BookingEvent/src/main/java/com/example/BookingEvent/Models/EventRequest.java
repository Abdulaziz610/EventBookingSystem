package com.example.BookingEvent.Models;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class EventRequest {
    private long eventID;
    private String eventName;
    private LocalDate eventDate;
    private String  eventLocation;
    private int NumberOfAvailableTicket;

}
