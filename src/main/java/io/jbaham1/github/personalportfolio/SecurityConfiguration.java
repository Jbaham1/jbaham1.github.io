package io.jbaham1.github.personalportfolio;


import io.jbaham1.github.personalportfolio.services.UserDetailsLoader;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    private UserDetailsLoader userDetailsLoader;
}
