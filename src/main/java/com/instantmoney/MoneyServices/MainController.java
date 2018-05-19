package com.instantmoney.MoneyServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.instantmoney.MoneyServices.Sender;
import com.instantmoney.MoneyServices.SenderRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/moneyservice") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called senderRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private SenderRepository senderRepository;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewSender (@RequestParam String firstName, @RequestParam String lastName, 
			@RequestParam String slocation) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Sender s = new Sender();
		s.setS_first_name(firstName);
		s.setS_last_name(lastName);
		s.setSlocation(slocation);
		senderRepository.save(s);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Sender> getAllSenders() {
		// This returns a JSON or XML with the users
		return senderRepository.findAll();
	}
}