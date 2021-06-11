package in.cryptogurus.SimpleLogin.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
    @RequestMapping("/")  
    @ResponseBody  
    public String index() {  
        return "<h2><center>Yes!!! You have made it!!!</center></h2>";  
    }  

    // Login form  
    @RequestMapping("/login.html")  
    public String login() {  
        return "login.html";  
    }  

    // Login form with error  
    @RequestMapping("/login-error.html")  
    public String loginError(Model model) {  
        model.addAttribute("loginError", true);  
        return "login.html";  
    }
}
