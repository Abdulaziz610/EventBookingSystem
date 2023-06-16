package com.example.BookingEvent.Repository;
import com.example.BookingEvent.Models.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<EventModel, Long> {
}
