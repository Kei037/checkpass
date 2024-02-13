package com.checkpass.service;

import com.checkpass.dto.UserDTO;

public interface UserService {
    Long joinRegister(UserDTO userDTO);
    UserDTO readOne(Long uno);
}
