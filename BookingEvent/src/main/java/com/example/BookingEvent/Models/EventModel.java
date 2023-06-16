package com.example.BookingEvent.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Data
@Setter
@Getter
@Entity
@Table
        (name = "EventTable")
public class EventModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Column(nullable = false)
    String eventName;

    @Column(nullable = false)
    LocalDate eventDate;

    @Column(nullable = false)
    String eventLocation;

    @Column(nullable = false)
    int NumberOfAvailableTicket;

    @OneToMany(mappedBy = "EventID", cascade = CascadeType.ALL)
    List<BookingModel> BookingTable;

}
