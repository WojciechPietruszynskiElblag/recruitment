package pl.pietruszynski.Recruitment.posts.entity;

import lombok.*;
import pl.pietruszynski.Recruitment.comments.dto.CommentDTO;
import pl.pietruszynski.Recruitment.comments.entity.Comment;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode()
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name ="title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "creationdate")
    private Timestamp creationDate;
    @OneToMany(mappedBy = "postId")
    private List<Comment> commentList;



}
