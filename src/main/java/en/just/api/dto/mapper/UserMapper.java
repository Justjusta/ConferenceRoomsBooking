package en.just.api.dto.mapper;

import en.just.api.dto.UserDTO;
import en.just.dao.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserMapper implements GenericMapper<User, UserDTO> {
    @Override
    public UserDTO fromModel(User input) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(input, userDTO);
        return userDTO;
    }

    @Override
    public User fromDto(UserDTO output) {
        User user = new User();
        BeanUtils.copyProperties(output, user);
        return user;
    }
}
