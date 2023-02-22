package pl.pietruszynski.Recruitment.comments.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class CommentDTO {
    private Integer id;
    private String title;
    private String content;
    private Integer postId;
    private Timestamp creationDate;
}
