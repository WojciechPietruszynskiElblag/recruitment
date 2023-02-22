package pl.pietruszynski.Recruitment.comments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pietruszynski.Recruitment.comments.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
