package com.naumov.social.service;

import com.naumov.social.dto.UserDto;
import com.naumov.social.mapper.UserMapperImpl;
import com.naumov.social.model.User;
import com.naumov.social.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapperImpl userMapper;

    public User createUser(UserDto userDto){
        User user = userMapper.userDtoToUser(userDto);
        User userSave = userRepository.save(user);
        return userSave;
    }
}
