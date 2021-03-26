package com.example.proareatesttask.mapper;

import com.example.proareatesttask.model.User;
import com.example.proareatesttask.model.dto.request.UserRequestDto;
import com.example.proareatesttask.model.dto.response.UserResponseDto;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toEntity(UserRequestDto userRequestDto) {
        User user = new User();
        user.setEmail(userRequestDto.getEmail());
        user.setPassword(userRequestDto.getPassword());
        return user;
    }

    public UserResponseDto toDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setEmail(user.getEmail());
        userResponseDto.setRoles(user
                .getRoles()
                .stream()
                .map(e -> e.getRoleName().name())
                .collect(Collectors.toList()));
        return userResponseDto;
    }
}
