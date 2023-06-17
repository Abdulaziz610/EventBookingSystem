package com.example.BookingEvent.ResponseObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class EventResponse {

    Integer eventID;
    String eventName;
    LocalDate eventDate;
    String  eventLocation;
    Integer NumberOfAvailableTicket;

}
