package sunda.logindemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    
public class PagesJumpController {    
    @RequestMapping("/ceshi")  
    public String msgToLogin(){  
          
        return "ceshi";  
        }  
    }  