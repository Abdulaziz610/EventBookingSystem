package com.example.BookingEvent.Controller;


import com.example.BookingEvent.Models.UserModel;
import com.example.BookingEvent.Repository.UserRepo;
import com.example.BookingEvent.RequestObject.NewUserRequest;
import com.example.BookingEvent.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepo    userRepo;

    @PostMapping("/api/register")
    public ResponseEntity<String> registerUser(@RequestBody NewUserRequest userRequest) {

    UserModel  newUserReq   = new UserModel();
    newUserReq.setUserName(userRequest.getUserName());
    newUserReq.setUserPassword(userRequest.getUserPassword());

    userRepo.save(newUserReq);
    return ResponseEntity.ok("User register successfully");


        }

    }


