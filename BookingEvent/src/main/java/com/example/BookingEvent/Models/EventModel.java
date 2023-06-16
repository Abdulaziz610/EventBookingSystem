package com.example.BookingEvent.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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

    @OneToMany(mappedBy = "EventID", cascade = CascadeType.ALL)
    List<BookingModel> BookingTable;

}
