package pl.pietruszynski.Recruitment.comments.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode()
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "postid")
    private Integer postId;
    @Column(name = "creationdate")
    private Timestamp creationDate = Timestamp.valueOf(LocalDateTime.now());

}
