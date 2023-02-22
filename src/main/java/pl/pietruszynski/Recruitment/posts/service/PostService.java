package pl.pietruszynski.Recruitment.posts.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.pietruszynski.Recruitment.posts.dto.PostDTO;
import pl.pietruszynski.Recruitment.posts.repository.PostRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final ModelMapper modelMapper = new ModelMapper();


    public List<PostDTO> findAllPost() {
        return postRepository.findAllByOrderByCreationDateDesc().stream().map(post -> modelMapper.map(post, PostDTO.class)).collect(Collectors.toList());
    }


}
