package com.example.proareatesttask.controller;

import com.example.proareatesttask.mapper.UserMapper;
import com.example.proareatesttask.model.Role;
import com.example.proareatesttask.model.User;
import com.example.proareatesttask.model.dto.request.UserRequestDto;
import com.example.proareatesttask.model.dto.response.UserResponseDto;
import com.example.proareatesttask.service.RoleService;
import com.example.proareatesttask.service.UserService;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;
    private final RoleService roleService;

    @PostMapping
    public void create(@RequestBody UserRequestDto userRequestDto) {
        User user = userMapper.toEntity(userRequestDto);
        Set<Role> roleSet = new HashSet<>();
        roleSet.add(roleService.getByName("USER"));
        user.setRoles(roleSet);
        userService.save(user);
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable Long userId) {
        User user = userService.getById(userId);
        userService.delete(user);
    }

    @GetMapping("/{userId}")
    public UserResponseDto get(@PathVariable Long userId) {
        User user = userService.getById(userId);
        return userMapper.toDto(user);
    }

    @PutMapping
    public UserResponseDto update(@RequestBody UserRequestDto userRequestDto) {
        User user = userMapper.toEntity(userRequestDto);
        User updated = userService.update(user);
        return userMapper.toDto(updated);
    }
}
