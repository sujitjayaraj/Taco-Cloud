package tech.sujitjayaraj.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import tech.sujitjayaraj.tacocloud.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
