package code.challenge.chat.repo;

import code.challenge.chat.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
