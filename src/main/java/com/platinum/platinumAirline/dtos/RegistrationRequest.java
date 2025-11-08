package com.platinum.platinumAirline.dtos;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class RegistrationRequest {

    @NotBlank(message = " Name is Required")
    private String name;

    @NotBlank(message = "Email is Required")
    @Email(message = "Invalid Email Format")
    private String email;

    @NotBlank(message =  "Password is required")
    @Size(min = 3, message = "Password Must Be at Least 3 Characters Long")
    private String password;

    private String phoneNumber;

    private List<String> roles;

}
