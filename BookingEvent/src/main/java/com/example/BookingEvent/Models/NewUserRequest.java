package com.example.BookingEvent.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Data
@Entity

public class NewUserRequest {
    private String userName;
    private String userPassword;
}
