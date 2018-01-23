package sunda.logindemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("user")
public class HomeController {

    @ModelAttribute("user")
    public User initUser() {
        return new User("guest", "guest");
    }

    @InitBinder("user")
    public void initBinderUser(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("user.");
    }

    @RequestMapping(value = "/")
    public String home() {
        return "login";
    }

    @RequestMapping(value = "/test")
    public String home1() {
        return "test";
    }

    @PostMapping(value = "/login")
    public String login(@ModelAttribute("user") User user, Model modelMap) throws Exception {
        if (user.getUsername().equals("admin") && user.getPassword().equals("123456")) {
            modelMap.addAttribute("username", user.getUsername());
            return "success";
        }
        return "login";
    }

}
