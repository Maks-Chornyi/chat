package code.challenge.chat.controller;

import code.challenge.chat.domain.User;
import code.challenge.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restApi")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable(name = "id") Long id) {
        return userService.findUserById(id);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
//        User user = new User(username);
        return userService.createUser(user);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable(name = "id") Long id, @RequestBody User user) {
        return userService.updateUser(user, id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}