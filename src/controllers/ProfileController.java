package controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Profile;

@Controller
public class ProfileController {

	// @Autowired
	private Profile profile;

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	// @RequestMapping(value = "/response.htm", method = RequestMethod.POST)
	// public String createProfile(@ModelAttribute("profile") Profile profile,
	// ModelMap model) {
	//
	// String resultStr = "";
	//
	// resultStr += "Hi, " + profile.getName() + "<br/>";
	// resultStr += "Here's your registration information:" + "<br/>";
	//
	// String temp = "";
	// temp +=
	// "<table><tr><td>Name:</td>" + profile.getName() + "</td></tr><br/>" +
	// "<table><tr><td>Age:</td>" + profile.getAge() + "</td></tr><br/>" +
	// "<table><tr><td>Email:</td>" + profile.getEmail() + "</td></tr><br/>" +
	// "<table><tr><td>Street:</td>" + profile.getStreet() + "</td></tr><br/>" +
	// "<table><tr><td>City:</td>" + profile.getCity() + "</td></tr><br/>" +
	// "<table><tr><td>State:</td>" + profile.getState() + "</td></tr><br/>";
	//
	// resultStr += temp + "<br/><br/>";
	// resultStr += "Again, thank you very much for your
	// registration,<br/>Regards,<br/>Suguru";
	//
	// model.put("response", resultStr);
	//
	// return "response";
	// }

	@RequestMapping(value = "/response", method = RequestMethod.POST)
	public String createProfile(Model model, @Valid Profile profile, BindingResult result) {
		System.out.println(profile);
		String resultStr = "";

		resultStr += "Hi, " + profile.getName() + "<br/><br/>";
		resultStr += "Here's your registration information:";

		String temp = "";
		temp += "<table style=\"text-Align=center\">" + 
				"<tr><td>Name:</td><td>" + profile.getName() + "</td></tr><br/>" + 
				"<tr>td>ID:</td><td>" + profile.getId() + "</td></tr><br/>" +
				"<tr><td>Age:</td><td>" + profile.getAge() + "</td></tr><br/>" + 
				"<tr><td>Email:</td><td>" + profile.getEmail() + "</td></tr><br/>" + 
				"<tr><td>Street:</td><td>" + profile.getStreet() + "</td></tr><br/>" + 
				"<tr><td>City:</td><td>" + profile.getCity() + "</td></tr><br/>" + 
				"<tr><td>State:</td><td>" + profile.getState() + "</td></tr></table>";

		resultStr += temp + "<br/><br/>";
		resultStr += "Again, thank you very much for your registration,<br/>Regards,<br/>Suguru";

		if (result.hasErrors()) {
			System.out.println("Form does not validate");
			List<ObjectError> errors = result.getAllErrors();

			for (ObjectError error : errors) {
				System.out.println(error);
				return "home";
			}
		} else {
			model.addAttribute("profile", profile);
			model.addAttribute("response", resultStr);
		}
		return "response";
	}

}
