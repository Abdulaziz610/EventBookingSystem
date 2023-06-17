package com.example.BookingEvent.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class EventModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    LocalDate date;
    String location;
    Integer ticketsAvailable;
}
