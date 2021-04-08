package io.jbaham1.github.personalportfolio.controllers;

import io.jbaham1.github.personalportfolio.models.User;
import io.jbaham1.github.personalportfolio.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserRepository userDao;

    public UserController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/sign-up")
    public String showSignupForm(Model viewModel) {
        viewModel.addAttribute("user", new User());
       User user = new User();
        return "users/sign-up";
    }

    @PostMapping("/sign-up")
    public String saveUser(@ModelAttribute User user, Model viewModel) {
        userDao.save(user);
        return "redirect:/blogs/index";
    }

}
