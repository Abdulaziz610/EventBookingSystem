package com.example.BookingEvent.Services;


import com.example.BookingEvent.Models.BookingModel;
import com.example.BookingEvent.Repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookingService {
@Autowired
    BookingRepo bookingRepo;
    List<BookingModel> listOfAllBooking(){
        return bookingRepo.findAll();

    }
}
