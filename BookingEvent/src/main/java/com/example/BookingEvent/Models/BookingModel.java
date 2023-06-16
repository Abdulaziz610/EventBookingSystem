package com.example.BookingEvent.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

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

    List<BookingModel> BookingTable;

}
