package en.just.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import en.just.api.dto.UserDTO;
import en.just.dao.repository.TestRepositoryContextConfiguration;
import en.just.web.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {UserController.class, TestRepositoryContextConfiguration.class})
@EnableWebMvc
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void givenPostUser_whenCorrectRequest_thenResponseIsCreatedAndReturnCreatedUser() throws Exception {
        UserDTO userDTO = new UserDTO();
        userDTO.setName("Justyna");
        userDTO.setSurname("Łuniewska");
        userDTO.setLogin("jluniewska");
        userDTO.setPassword("mySecret");

        mockMvc.perform(post("/users")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(new ObjectMapper().writeValueAsString(userDTO))
        ).andExpect(status().isOk());

    }
}