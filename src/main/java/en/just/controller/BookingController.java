package en.just.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import en.just.service.BookingService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@PostMapping
	public String create() {
		bookingService.create();
		return null;
	}

}
