package com.bridgelabz.bookstore.DTO;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Data
public class UserDto {

    private String fullName;

    @Column(unique = true)
    private String emailId;

    private String password;

    private long mobileNumber;


}

