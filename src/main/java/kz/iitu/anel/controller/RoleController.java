package kz.iitu.anel.controller;

import kz.iitu.anel.model.Role;
import kz.iitu.anel.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    RoleRepo repo;

    @PostMapping("/role")
    public void addRole(Role role) {
        repo.save(role);
    }
}
