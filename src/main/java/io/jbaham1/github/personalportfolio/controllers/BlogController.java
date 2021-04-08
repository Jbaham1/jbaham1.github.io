package io.jbaham1.github.personalportfolio.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class BlogController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring!";
    }
}
