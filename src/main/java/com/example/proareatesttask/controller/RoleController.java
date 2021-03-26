package com.example.proareatesttask.controller;

import com.example.proareatesttask.mapper.RoleMapper;
import com.example.proareatesttask.model.dto.request.RoleRequestDto;
import com.example.proareatesttask.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;
    private final RoleMapper roleMapper;

    @PostMapping
    public void create(@RequestBody RoleRequestDto roleRequestDto) {
        roleService.saveRole(roleMapper.toEntity(roleRequestDto));
    }
}
