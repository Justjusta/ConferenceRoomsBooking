package en.just.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import en.just.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findFirstByLogin(String login);

	User findFirstByEmail(String email);

	User findFirstByName(String name);

	Boolean existsByLogin(String login);

}
