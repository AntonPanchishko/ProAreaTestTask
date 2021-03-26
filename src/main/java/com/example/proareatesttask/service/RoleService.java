package com.example.proareatesttask.service;

import com.example.proareatesttask.model.Role;

public interface RoleService {
    Role saveRole(Role role);

    Role getByName(String roleName);
}
