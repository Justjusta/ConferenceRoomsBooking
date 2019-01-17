package en.just.dao.repository;

import en.just.dao.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestRepositoryContextConfiguration.class)
@Transactional
public class UserRepositoryIntegrationTest {

    private static final String USER_NAME = "Justyna";

    @Autowired
    private UserRepository userRepository;

    @Test
    public void givenUser_whenSave_thenGetCorrectUserFromDb() {
        User user = new User("Justyna", "Łuniewska", "jluniewska", "mySecret");
        User savedUser = userRepository.save(user);

        User userFromDb = userRepository.findById(savedUser.getId()).get();
        assertEquals("User name is incorrect", USER_NAME, userFromDb.getName());
    }
}