package io.jbaham1.github.personalportfolio.controllers;

import io.jbaham1.github.personalportfolio.models.Blog;
import io.jbaham1.github.personalportfolio.repositories.BlogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BlogController {
private final BlogRepository blogDao;

    public BlogController(BlogRepository blogDao) {
        this.blogDao = blogDao;
    }


    @GetMapping("/blogs")
    public String seeAllPosts(Model viewModel) {
    viewModel.addAttribute("blogs", blogDao.findAll());
        return "blogs/index";
    }

    @GetMapping("/posts/{id}")
    public String showOnePost(@PathVariable Long id) {
        return "/blogs/show";
    }


        @GetMapping("/blogs/create")
        public String showCreateForm() {
            return "blogs/create";
        }

        @PostMapping("/blogs/create")
        public String create(
                @RequestParam(name = "title") String title,
                @RequestParam(name = "body") String body
        ) {
            Blog blog = new Blog();
            blog.setTitle(title);
            blog.setBody(body);
            // save the ad...
            return "redirect:/blogs";
        }
    }

