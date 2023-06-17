package com.example.BookingEvent.RequestObject;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor


public class EventRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    Integer eventID;
    String eventName;
    LocalDate eventDate;
    String eventLocation;
    Integer NumberOfAvailableTicket;

}
