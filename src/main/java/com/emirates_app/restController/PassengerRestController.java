package com.emirates_app.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.emirates_app.entity.Passenger;
import com.emirates_app.repository.PassengerRepository;

@RestController
@RequestMapping("/api/v1")
public class PassengerRestController {
	@Autowired
	private PassengerRepository passRepo;

	// http://localhost:8080/api/v1/listpassapi
	@GetMapping("/listpassapi")
	public List<Passenger> getAllApi(Passenger pass) {
		List<Passenger> allPassApi = passRepo.findAll();

		return allPassApi;
	}

	// http://localhost:8080/api/v1/savepassapi
	@PostMapping("/savepassapi")
	public void savePassApi(@RequestBody Passenger pass) {
		passRepo.save(pass);

	}

	// http://localhost:8080/api/v1/updatepassapi
	@PutMapping("/updatepassapi")
	public void updatePassApi(@RequestBody Passenger pass) {
		passRepo.save(pass);
	}

	// http://localhost:8080/api/v1/deletepassapi/17
	@DeleteMapping("/deletepassapi/{id}")
	public void deletePassApi(@PathVariable("id") long id) {
		passRepo.deleteById(id);

	}
}
