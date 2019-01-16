package en.just.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import en.just.repository.BookingRepository;
import en.just.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BookingRepository bookingRepository;

	public String create() {
		// bookingRepository.save(arg0);
		return null;
	}

}