package pl.pietruszynski.Recruitment.comments.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pietruszynski.Recruitment.comments.entity.Comment;
import pl.pietruszynski.Recruitment.comments.repository.CommentRepository;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public void addComment(Comment comment) {

        commentRepository.save(comment);
    }


    public void deleteComment(Integer id) {
        commentRepository.deleteById(id);
    }
}
