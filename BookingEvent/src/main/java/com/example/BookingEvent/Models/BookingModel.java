package com.example.BookingEvent.Models;


import com.example.BookingEvent.RequestObject.EventRequest;
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
        (name = "BookingTable")

public class BookingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    UserModel userID;
    EventRequest EventID;
    int ticketsNumber;
    @Enumerated(EnumType.STRING)
    BookingStatus bookingStatus;

    public enum BookingStatus {
        CONFIRMED,
        CANCELLED
    }

    List<BookingModel> BookingTable;

}
