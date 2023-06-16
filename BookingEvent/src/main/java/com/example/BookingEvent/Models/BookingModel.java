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

    @ManyToOne
    @JoinColumn(name= "UserID")
    User userID;


    @OneToMany(mappedBy = "userID", cascade = CascadeType.ALL)
    List<BookingModel> BookingTable;

}
