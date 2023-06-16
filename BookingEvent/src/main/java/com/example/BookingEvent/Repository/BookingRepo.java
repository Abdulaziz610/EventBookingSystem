package com.example.BookingEvent.Repository;

import com.example.BookingEvent.Models.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<BookingModel, Long> {
}
