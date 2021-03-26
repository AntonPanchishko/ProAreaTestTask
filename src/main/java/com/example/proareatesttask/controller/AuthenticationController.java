package com.example.proareatesttask.controller;

import com.example.proareatesttask.mapper.UserMapper;
import com.example.proareatesttask.model.Role;
import com.example.proareatesttask.model.User;
import com.example.proareatesttask.model.dto.request.UserRequestDto;
import com.example.proareatesttask.service.RoleService;
import com.example.proareatesttask.service.UserService;
import jakarta.validation.Valid;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AuthenticationController {
    private final UserService userService;
    private final UserMapper userMapper;
    private final RoleService roleService;

    @PostMapping("/users/register")
    public void register(@RequestBody @Valid UserRequestDto userRequestDto) {
        User user = userMapper.toEntity(userRequestDto);
        Set<Role> roleSet = new HashSet<>();
        roleSet.add(roleService.getByName("USER"));
        user.setRoles(roleSet);
        userService.save(user);
    }
}
