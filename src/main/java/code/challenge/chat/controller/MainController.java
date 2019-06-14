package code.challenge.chat.controller;

import code.challenge.chat.domain.User;
import code.challenge.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    UserService userService;

    @GetMapping()
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping()
    public User createUser(@RequestBody String username) {
        User user = new User(username);
        return userService.createUser(user);
    }

    @DeleteMapping()
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PutMapping()
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

}