package en.just.web.controller;

import en.just.web.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
//@RequiredArgsConstructor
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@PostMapping
	public String create() {
		bookingService.create();
		return null;
	}

}
