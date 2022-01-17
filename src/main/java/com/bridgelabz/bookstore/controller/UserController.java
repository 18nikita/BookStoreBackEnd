package com.bridgelabz.bookstore.controller;


import com.bridgelabz.bookstore.DTO.UserDto;
import com.bridgelabz.bookstore.Response.Response;
import com.bridgelabz.bookstore.Service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserInterface userService;

    @PostMapping("/signup")
    public ResponseEntity<Response> registration(@RequestBody final UserDto userDto ) {
        userService.register(userDto);
        return ResponseEntity.status (HttpStatus.CREATED)
                .body (new Response ("Registration successful... check your mail for verification!", 201));
    }
}
