package io.jbaham1.github.personalportfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class BlogController {

    @GetMapping("/posts")
    public String seeAllPosts() {
        return "blog/index";
    }

    @GetMapping("/posts/{id}")
    public String showOnePost(@PathVariable Long id) {
        return "/blog/show";
    }

}

