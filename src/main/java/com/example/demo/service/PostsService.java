package com.example.demo.service;

import com.example.demo.dto.PostDTO;

import java.util.List;

public interface PostsService {
  List<PostDTO> getAllPosts();
}
