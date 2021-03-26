package com.example.proareatesttask.mapper;

import com.example.proareatesttask.model.Role;
import com.example.proareatesttask.model.dto.request.RoleRequestDto;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {
    public Role toEntity(RoleRequestDto roleRequestDto) {
        Role role = new Role();
        role.setRoleName(Role.RoleName.valueOf(roleRequestDto.getRoleName()));
        return role;
    }
}
