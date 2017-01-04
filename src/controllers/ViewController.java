package controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Profile;

@Controller
public class ViewController {

	// @RequestMapping("/")
	// public ModelAndView showHome() {
	//
	// ModelAndView mv = new ModelAndView("home");
	//
	// Map<String, Object> model = mv.getModel();
	//
	// model.put("name", "Suguru");
	//
	// return mv;
	// }

//	@Autowired
//	@Qualifier("profile")
	private Profile profile = new Profile();

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

//	@Autowired
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String showHome(Model model) {
		System.out.println(profile);
		model.addAttribute("profile", profile);
		System.out.println("here here here here");
		System.out.println("here here here here");
		System.out.println("here here here here");
		System.out.println("here here here here");
		System.out.println("here here here here");
		return "home";
	}

}
