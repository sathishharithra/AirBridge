package com.emirates_app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emirates_app.entity.Passenger;
import com.emirates_app.repository.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
	private PassengerRepository passRepo;

	@Override
	public void savePassData(Passenger pass) {
		passRepo.save(pass);

	}

	@Override
	public List<Passenger> listallPassData(Passenger pass) {
		List<Passenger> allPassData = passRepo.findAll();
		return allPassData;
	}

	@Override
	public void deleteOnePass(long id) {
		passRepo.deleteById(id);

	}

	@Override
	public Passenger updateOnePass(long id) {
		Optional<Passenger> onePass = passRepo.findById(id); //optional class is a java 8 feature it will handle null pointer exception
	    Passenger passenger = onePass.get();// get method will convert optional object to normal object
	    
		return passenger;
	}

	@Override
	public void updateOnePass(Passenger pass1) {
		passRepo.save(pass1);
	}

}
