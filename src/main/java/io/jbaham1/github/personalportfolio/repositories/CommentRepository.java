package io.jbaham1.github.personalportfolio.repositories;

import io.jbaham1.github.personalportfolio.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
