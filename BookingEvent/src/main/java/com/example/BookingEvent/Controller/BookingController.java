package com.example.BookingEvent.Controller;

import com.example.BookingEvent.Models.EventModel;
import com.example.BookingEvent.RequestObject.BookingRequest;
import com.example.BookingEvent.RequestObject.EventRequest;
import com.example.BookingEvent.Services.BookingService;
import com.example.BookingEvent.Services.EventService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Data

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @Autowired
    BookingRequest bookingRequest;


    @DeleteMapping("/api/bookings/{bookingId}")
    public ResponseEntity<String> cancelBooking(@PathVariable Long bookingId) {
        bookingService.cancelBooking(bookingId);
        return ResponseEntity.noContent().build();
    }


}
