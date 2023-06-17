package com.example.BookingEvent.Repository;
import com.example.BookingEvent.RequestObject.EventRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<EventRequest, Long> {
}
