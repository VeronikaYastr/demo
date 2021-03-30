package com.example.demo.service.impl;

import com.example.demo.dao.PostDao;
import com.example.demo.dao.domain.Post;
import com.example.demo.dto.PostDTO;
import com.example.demo.mapper.PostMapper;
import com.example.demo.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostsServiceImpl implements PostsService {

  private final PostDao postDao;

  @Override
  public List<PostDTO> getAllPosts() {
    List<Post> fromDb = postDao.getAllPosts();
    List<PostDTO> result = new ArrayList<>();
    for (Post post : fromDb) {
      result.add(PostMapper.postToDto(post));
    }
    return result;
    // return fromDb.stream().map(PostMapper::postToDto).collect(Collectors.toList());
  }
}
