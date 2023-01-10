package com.naumov.social.mapper;

import com.naumov.social.dto.UserDto;
import com.naumov.social.model.User;

public interface UserMapper {
    User userDtoToUser(UserDto userDto);
}
