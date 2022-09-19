package com.edu.ulab.app.service.impl;

import com.edu.ulab.app.dto.UserDto;
import com.edu.ulab.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.edu.ulab.app.storage.Storage.deleteUserFromStorage;
import static com.edu.ulab.app.storage.Storage.getUserFromStorage;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private static long userId;

    @Override
    public UserDto createUser(UserDto userDto) {
        if (userDto.getId() == null) {
            userDto.setId(userId++);
        }
        return userDto;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return getUserFromStorage(userId);
    }

    @Override
    public UserDto getUserById(Long id) {
        return getUserFromStorage(id);
    }

    @Override
    public void deleteUserById(Long id) {
        deleteUserFromStorage(id);

    }
}