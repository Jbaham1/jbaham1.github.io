package io.jbaham1.github.personalportfolio.repositories;


import io.jbaham1.github.personalportfolio.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
