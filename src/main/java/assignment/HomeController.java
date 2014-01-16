package assignment;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showIndexPage(Map<String, Object> model) throws Exception {
		return "index.jsp";
	}
	
	
	private String id = "admin";
	private String password = "admin";
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam String identifier, @RequestParam String password) {
		if( "admin".equals(identifier) && "admin".equals(password) ) {
			System.out.println("로그인 되었습니다.");
			return "home.jsp";
		}
		else
			return "error.jsp";
	}
}
