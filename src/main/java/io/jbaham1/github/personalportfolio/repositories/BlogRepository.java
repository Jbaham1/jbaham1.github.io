package io.jbaham1.github.personalportfolio.repositories;

import io.jbaham1.github.personalportfolio.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    Blog findByTitle(String title);
    Blog findFirstByTitle(String title);
}
