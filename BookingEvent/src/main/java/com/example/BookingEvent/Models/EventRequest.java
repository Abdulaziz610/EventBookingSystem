package com.example.BookingEvent.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@Data
@Entity


public class EventRequest {
    private long eventID;
    private String eventName;
    private LocalDate eventDate;
    private String  eventLocation;
    private int NumberOfAvailableTicket;

}
