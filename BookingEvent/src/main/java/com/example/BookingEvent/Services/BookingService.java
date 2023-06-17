package com.example.BookingEvent.Services;


import com.example.BookingEvent.Models.BookingModel;
import com.example.BookingEvent.Repository.BookingRepo;
import com.sun.java.accessibility.util.EventID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BookingService {
@Autowired
    BookingRepo bookingRepo;
    List<BookingModel> listOfAllBooking(){
        return bookingRepo.findAll();
    }

    public void cancelBooking(Long bookingId) {
        Optional<BookingModel> optionalBooking = bookingRepo.findById(bookingId);
        if (optionalBooking.isPresent()) {
            BookingModel booking = optionalBooking.get();
            booking.setBookingStatus(BookingModel.BookingStatus.CANCELLED);
            bookingRepo.save(booking);
        } else {
            throw new IllegalArgumentException("Booking not found with ID: " + bookingId);
        }
    }

}
