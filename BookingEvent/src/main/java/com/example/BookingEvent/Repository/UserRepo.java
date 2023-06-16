package com.example.BookingEvent.Repository;

import com.example.BookingEvent.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, Long> {
}
