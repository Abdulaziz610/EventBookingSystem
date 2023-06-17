package com.example.BookingEvent.ResponseObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class BookingRequest {

    Integer BookingID;
    String BookingName;
    LocalDate BookingDate;
    String  BookingLocation;
    Integer numberOfTickets;
}
