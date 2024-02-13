package com.checkpass.service;

import com.checkpass.domain.User;
import com.checkpass.dto.UserDTO;
import com.checkpass.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    @Override
    public Long joinRegister(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        Long uno = userRepository.save(user).getUno();
        return uno;
    }

    @Override
    public UserDTO readOne(Long uno) {
        return null;
    }
}
