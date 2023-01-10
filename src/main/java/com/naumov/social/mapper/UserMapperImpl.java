package com.naumov.social.mapper;

import com.naumov.social.dto.UserDto;
import com.naumov.social.model.User;
import org.springframework.stereotype.Component;


@Component
public class UserMapperImpl implements UserMapper{

    @Override
    public User userDtoToUser(UserDto userDto) {
       User user = new User();
        user.setEmail(userDto.getEmail());
        user.setUsername(userDto.getUsername());
        user.setPoint(userDto.getPoint());
       return user;
    }
}
