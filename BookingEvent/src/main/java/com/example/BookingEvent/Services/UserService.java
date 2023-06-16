package com.example.BookingEvent.Services;


import com.example.BookingEvent.Models.UserModel;
import com.example.BookingEvent.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo  userRepo;

    List<UserModel> ListOfAllUsers(){
        return userRepo.findAll();
    }
}
