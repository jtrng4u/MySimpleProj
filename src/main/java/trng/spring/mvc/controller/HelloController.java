package trng.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello World!!");
		return "welcome";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String greetMessage(ModelMap model) {
		model.addAttribute("message", "Welcome to Spring MVC");
		return "welcome";
	}
	
	@RequestMapping(value = "/greetings/{name}/phone/{phone}")
	public String greetings(@PathVariable (value="name") String userName, @PathVariable (value="phone") String phone, ModelMap model) {
		model.addAttribute("message", "User: " + userName + " Phone: " + phone);
		return "welcome";
	}
	
	@RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET)
	public String greetMe(@PathVariable (value="name") String userName, ModelMap model) {
		model.addAttribute("message", "Hi " + userName + " Welcome to Spring MVC");
		return "welcome";
	}
	
	@RequestMapping(value = "/greeting", method = RequestMethod.GET, params="phone=4563565678")
	public String greetHim(@RequestParam(required=false) String name, ModelMap model) {
		String personName = "Anonymous";
		
		if (name != null) {
			personName = name; 
		}
		
		model.addAttribute("message", "Hello!!" + personName + " Welcome to Spring MVC");
		return "welcome";
	}
	
	@ModelAttribute
	public void loadAccount(@RequestParam String accountNumber, Model model) {
		System.out.println("loadAccount called");
		Account account = loadAccountData(accountNumber);
		model.addAttribute("account", account);
	}
	
	@ModelAttribute
	public void changeAccount(@RequestParam String accountNumber, ModelMap model) {
		System.out.println("changeAccount called");
		Account account = (Account) model.get("account");
		account.setBalance(375f);
		model.addAttribute("account", account);
	}
	
	@RequestMapping(value="/updateAccount")
	public String updateAccount(@RequestParam String accountNumber, @ModelAttribute Account account, ModelMap model) {
//		Account account = model.get("account");
		System.out.println(account);
		return "updateAccountView";
	}
	
	
	private Account loadAccountData(String accountNumber) {
		Account account = new Account(1245, 300.00f, "Savings");
		return account;
	}
}
