package com.example.proareatesttask.service.impl;

import com.example.proareatesttask.model.Role;
import com.example.proareatesttask.repository.RoleRepository;
import com.example.proareatesttask.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleRepository.getByRoleName(Role.RoleName.valueOf(roleName));
    }
}
