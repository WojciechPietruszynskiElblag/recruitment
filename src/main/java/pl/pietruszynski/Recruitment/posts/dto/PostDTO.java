package pl.pietruszynski.Recruitment.posts.dto;

import lombok.Getter;
import lombok.Setter;
import pl.pietruszynski.Recruitment.comments.entity.Comment;

import java.util.List;

@Getter
@Setter
public class PostDTO {
    private Integer id;
    private String title;
    private String content;
    private List<Comment> comment;
}
