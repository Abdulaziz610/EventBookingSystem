package com.example.BookingEvent.RequestObject;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class UserRequest {
    String userName;
    String userPassword;
}
