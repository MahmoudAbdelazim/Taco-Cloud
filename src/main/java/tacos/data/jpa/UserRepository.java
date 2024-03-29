package tacos.data.jpa;

import org.springframework.data.repository.CrudRepository;
import tacos.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}