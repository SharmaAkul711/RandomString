package com.RandomString.RandomString.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JkController {
     private final com.RandomString.RandomString.Controllers.JkService jkService;

    public JkController(com.RandomString.RandomString.Controllers.JkService jkService) {
        this.jkService = jkService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

         model.addAttribute("joke", new com.RandomString.RandomString.Controllers.JkServiceImpl().getJokes());
         return "Index";
    }
}
