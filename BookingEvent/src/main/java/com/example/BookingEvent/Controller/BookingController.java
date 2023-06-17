package com.example.BookingEvent.Controller;

import com.example.BookingEvent.Models.EventModel;
import com.example.BookingEvent.RequestObject.BookingRequest;
import com.example.BookingEvent.RequestObject.EventRequest;
import com.example.BookingEvent.Services.BookingService;
import com.example.BookingEvent.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;


    @PostMapping("/api/events/{eventId}/bookings")
    public ResponseEntity<String> bookTickets(
            @PathVariable Long eventId,
            @RequestBody BookingRequest bookingRequest
    ) {
        // Retrieve the event based on the eventId from the database
        EventModel event = EventService.getEvent(eventId);

        if (event == null) {
            // Event not found
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event not found");
        }

        int numberOfTickets = bookingRequest;

        if (numberOfTickets <= 0) {
            // Invalid number of tickets
            return ResponseEntity.badRequest().body("Number of tickets must be greater than zero");
        }

        if (numberOfTickets > event.) {
            // Not enough available tickets
            return ResponseEntity.badRequest().body("Not enough available tickets");
        }

        // Perform the booking and update the event's available tickets
        bookingService.bookTickets(event, numberOfTickets);

        return ResponseEntity.ok("Tickets booked successfully");
    }



    @DeleteMapping("/api/bookings/{bookingId}")
    public ResponseEntity<String> cancelBooking(@PathVariable Long bookingId) {
        bookingService.cancelBooking(bookingId);
        return ResponseEntity.noContent().build();
    }



}
