package com.emirates_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emirates_app.entity.Passenger;
import com.emirates_app.services.PassengerService;
import com.emirates_app.utils.Email;

@Controller
public class PassengerController {
	@Autowired
	private PassengerService passServ;
	// http://localhost:8080/flight
	@Autowired
	private Email emailServ;
	@RequestMapping("/flight")
	public String flightBooking() {
		return "flight";
	}

	@RequestMapping("/savepass")
	public String savepass(@ModelAttribute Passenger pass) {// model attribute will help to read all the form data and convert as java object (now it was optional)
															

		passServ.savePassData(pass);
		emailServ.emailSend(pass.getEmail(), "WELCOME", "Thanks for booking flight with us");
		return "flight";
	}

	// http://localhost:8080/listallpass
	@RequestMapping("/listallpass")
	public String listallPass(Passenger passenger, Model model) {// model help to transfer data from controller to view
		List<Passenger> allPassData = passServ.listallPassData(passenger);
		model.addAttribute("allPassData", allPassData);
		return "list_all_pass";
	}

	@RequestMapping("/deletepass")
	public String deletepass(@RequestParam("id") long id, Passenger passenger, Model model) {

		passServ.deleteOnePass(id);
		List<Passenger> allPassData = passServ.listallPassData(passenger);
		model.addAttribute("allPassData", allPassData);
		return "list_all_pass";
	}

	@RequestMapping("/updatepass")
	public String updatepass(@RequestParam("id") long id, Model model) {
		Passenger passenger = passServ.updateOnePass(id);
		model.addAttribute("passenger", passenger);

		return "update_pass";

	}

	@RequestMapping("/updateOnePass")
	public String updateOnePass(Passenger pass1, Model model) {

		passServ.updateOnePass(pass1);

		List<Passenger> allPassData = passServ.listallPassData(pass1);
		model.addAttribute("allPassData", allPassData);
		return "list_all_pass";
	}

}
