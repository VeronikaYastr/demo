package com.example.demo.controller;

import com.example.demo.dto.PostDTO;
import com.example.demo.service.PostsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/posts")
@Slf4j
@RequiredArgsConstructor
public class PostController {

  private final PostsService postsService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ResponseEntity<List<PostDTO>> getAllPosts() {
    try {
      List<PostDTO> posts = postsService.getAllPosts();
      return new ResponseEntity<>(posts, HttpStatus.OK);
    } catch (Exception ex) {
      throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Getting all posts failed.", ex);
    }
  }

}
