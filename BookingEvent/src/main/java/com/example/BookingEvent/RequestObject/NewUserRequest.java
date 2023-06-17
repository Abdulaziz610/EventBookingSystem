package com.example.BookingEvent.RequestObject;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class NewUserRequest {
    String userName;
    String userPassword;
}
