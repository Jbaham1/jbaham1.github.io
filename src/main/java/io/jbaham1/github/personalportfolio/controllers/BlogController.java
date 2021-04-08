package io.jbaham1.github.personalportfolio.controllers;

import io.jbaham1.github.personalportfolio.repositories.BlogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class BlogController {
private final BlogRepository blogDao;

    public BlogController(BlogRepository blogDao) {
        this.blogDao = blogDao;
    }


    @GetMapping("/blogs")
    public String seeAllPosts(Model viewModel) {
    viewModel.addAttribute("blogs", blogDao.findAll());
        return "blog/index";
    }

    @GetMapping("/posts/{id}")
    public String showOnePost(@PathVariable Long id) {
        return "/blog/show";
    }

}

