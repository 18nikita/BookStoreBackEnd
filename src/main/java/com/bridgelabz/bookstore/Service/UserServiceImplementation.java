package com.bridgelabz.bookstore.Service;

import com.bridgelabz.bookstore.DTO.UserDto;
import com.bridgelabz.bookstore.Model.UserEntity;
import com.bridgelabz.bookstore.Repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImplementation implements UserInterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean register(UserDto newUserDto) {
        UserEntity newUser = new UserEntity ();
        newUser.setFullName(newUserDto.getFullName());
        newUser.setEmailId(newUserDto.getEmailId());
        newUser.setMobileNumber(newUserDto.getMobileNumber());
        newUser.setPassword(newUserDto.getPassword());
        userRepository.save (newUser);
        return false;
    }
}
