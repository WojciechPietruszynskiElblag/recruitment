package pl.pietruszynski.Recruitment.comments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.pietruszynski.Recruitment.comments.dto.CommentDTO;
import pl.pietruszynski.Recruitment.comments.entity.Comment;
import pl.pietruszynski.Recruitment.comments.service.CommentService;

@Controller
@ResponseBody
@RequiredArgsConstructor
@RequestMapping("/api/comment")
public class CommentController {
    private final CommentService commentService;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody Comment comment) {
        commentService.addComment(comment);

    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT, reason = "Comment deleted")
    public void deleteUSer(@PathVariable Integer id) {
        commentService.deleteComment(id);
    }
}
