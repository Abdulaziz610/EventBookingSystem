package com.example.BookingEvent.RequestObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookingRequest {
    Integer BookingID;
    String BookingName;
    LocalDate BookingDate;
    String  BookingLocation;
    Integer numberOfTickets;
}
