package code.challenge.chat.service;

import code.challenge.chat.domain.User;
import code.challenge.chat.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<User> getAllUsers() {
        return (List<User>) userRepo.findAll();
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    public User updateUser(User newUser, Long id) {
        User userForUpdate = findUserById(id);
        userForUpdate.setId(id);
        userForUpdate.setPassword(newUser.getPassword());
        userForUpdate.setUsername(newUser.getUsername());
        return userRepo.save(userForUpdate);
    }

    public User findUserById(Long id) {
        return userRepo.findById(id).orElseThrow(RuntimeException::new);
    }
}
