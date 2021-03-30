package com.example.demo.dao.impl;

import com.example.demo.dao.PostDao;
import com.example.demo.dao.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PostDaoImpl implements PostDao {
  private final String SELECT_ALL_POSTS = "SELECT * FROM post";

  private final NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  public List<Post> getAllPosts() {
    return jdbcTemplate.query(SELECT_ALL_POSTS, (rs, rowNum) ->
        new Post()
            .setId(rs.getString("id"))
            .setName(rs.getString("name")));
  }
}
