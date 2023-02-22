package pl.pietruszynski.Recruitment.posts.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.pietruszynski.Recruitment.posts.dto.PostDTO;
import pl.pietruszynski.Recruitment.posts.entity.Post;
import pl.pietruszynski.Recruitment.posts.service.PostService;

import java.util.List;

@Controller
@ResponseBody
@RequiredArgsConstructor
@RequestMapping("/api")
public class PostController {
    private final PostService postService;

    @GetMapping("find/all")
    List<PostDTO> findAll() {
        return postService.findAllPost();
    }

}
