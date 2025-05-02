package edu.miu.eregistrar.lab_10.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"", "/eregistrar"})
public class HomeController {

    @GetMapping("/home")
    public String displayHomepage(){
        return "/home/index";
    }
}


