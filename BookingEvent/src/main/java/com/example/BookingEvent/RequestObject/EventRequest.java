package com.example.BookingEvent.RequestObject;


import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor



public class EventRequest {
    Integer eventID;
    String eventName;
    LocalDate eventDate;
    String  eventLocation;
    Integer NumberOfAvailableTicket;

}
