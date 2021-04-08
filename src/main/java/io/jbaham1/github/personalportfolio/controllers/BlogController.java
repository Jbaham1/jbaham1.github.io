package io.jbaham1.github.personalportfolio.controllers;

import io.jbaham1.github.personalportfolio.models.Blog;
import io.jbaham1.github.personalportfolio.models.User;
import io.jbaham1.github.personalportfolio.models.Comment;
import io.jbaham1.github.personalportfolio.repositories.BlogRepository;
import io.jbaham1.github.personalportfolio.repositories.CommentRepository;
import io.jbaham1.github.personalportfolio.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;


@Controller
public class BlogController {
private final BlogRepository blogDao;
private final UserRepository userDao;
private final CommentRepository commentDao;

    public BlogController(BlogRepository blogDao, UserRepository userDao, CommentRepository commentDao) {
        this.blogDao = blogDao;
        this.userDao = userDao;
        this.commentDao = commentDao;
    }


    @GetMapping("/blogs")
    public String seeAllPosts(Model viewModel) {
//    viewModel.addAttribute("blogs", blogDao.findAll());
        List<Blog> blogs = blogDao.findAll();
        Collections.reverse(blogs);
        viewModel.addAttribute("blogs", blogs);
        return "blogs/index";
    }

    @GetMapping("/posts/{id}")
    public String showOnePost(@PathVariable Long id, Model viewModel) {
        Blog blog = blogDao.getOne(id);
        viewModel.addAttribute("blog", blog);

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

