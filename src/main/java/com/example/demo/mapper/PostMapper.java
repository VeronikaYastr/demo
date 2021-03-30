package com.example.demo.mapper;

import com.example.demo.dao.domain.Post;
import com.example.demo.dto.PostDTO;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PostMapper {

  public static PostDTO postToDto(Post post) {
    return new PostDTO(post.getId(), post.getName());
  }
}
