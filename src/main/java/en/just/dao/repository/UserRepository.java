package en.just.dao.repository;

import en.just.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
    User findByLogin(String login);

//	User findFirstByLogin(String login);
//
//	User findFirstByEmail(String email);
//
//	User findFirstByName(String name);
//
//	Boolean existsByLogin(String login);

}
