package org.example.request;

import lombok.Data;

@Data
public class SignupRequest {

    private String username;
    private String password;

    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private String email;
    private String profilePic;
}
