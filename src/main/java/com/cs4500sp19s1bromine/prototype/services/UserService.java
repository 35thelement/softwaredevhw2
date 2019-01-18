package com.cs4500sp19s1bromine.prototype.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.cs4500sp19s1bromine.prototype.models.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserService {
    static List<User> users = new ArrayList<>();

    static {
        users.add(new User(123, "alice", "alice", "Alice", "Wonderland"));
        users.add(new User(234, "bob", "bob", "Bob", "Marley"));
    }

    @GetMapping("/api/user")
    public List<User> findAllUsers() {
        return users;
    }
}
