package com.example.clientv8.service;



import com.example.clientv8.dto.UserDto;
import com.example.clientv8.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
