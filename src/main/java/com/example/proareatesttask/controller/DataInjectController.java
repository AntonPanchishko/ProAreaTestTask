package com.example.proareatesttask.controller;

import com.example.proareatesttask.model.Product;
import com.example.proareatesttask.model.Role;
import com.example.proareatesttask.model.User;
import com.example.proareatesttask.service.ProductService;
import com.example.proareatesttask.service.RoleService;
import com.example.proareatesttask.service.UserService;
import java.util.Set;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/inject")
public class DataInjectController {
    private final RoleService roleService;
    private final UserService userService;
    private final ProductService productService;

    @PostMapping
    public void inject() {
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.valueOf("USER"));
        roleService.saveRole(userRole);

        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.valueOf("ADMIN"));
        roleService.saveRole(adminRole);

        Role role = roleService.getByName("USER");

        User bob = new User();
        bob.setRoles(Set.of(role));
        bob.setEmail("bob@mail.com");
        bob.setPassword("bob.password");
        userService.save(bob);

        User alice = new User();
        alice.setRoles(Set.of(role));
        alice.setEmail("alice@mail.com");
        alice.setPassword("alice.password");
        userService.save(alice);

        User jhon = new User();
        jhon.setRoles(Set.of(role));
        jhon.setEmail("jhon@mail.com");
        jhon.setPassword("jhon.password");
        userService.save(jhon);

        Product apple = new Product();
        apple.setProductName("apple");
        apple.setPrice(100L);
        productService.createProduct(apple);

        Product banana = new Product();
        banana.setProductName("banana");
        banana.setPrice(110L);
        productService.createProduct(banana);

        Product orange = new Product();
        orange.setProductName("orange");
        orange.setPrice(105L);
        productService.createProduct(orange);
    }
}
