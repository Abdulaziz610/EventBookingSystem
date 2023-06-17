package com.example.BookingEvent.ResponseObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class NewUserResponse {
    String userName;
    String userPassword;
}
