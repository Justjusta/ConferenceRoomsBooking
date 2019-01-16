package en.just.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import en.just.repository.BookingRepository;
import en.just.repository.RoomRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;

	@Autowired
	private BookingRepository bookingRepository;

	public String create() {
		// roomRepository.save(arg0);
		return null;
	}

}