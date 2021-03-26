package com.example.proareatesttask.repository;

import com.example.proareatesttask.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role getByRoleName(Role.RoleName roleName);
}
