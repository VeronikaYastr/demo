package com.example.demo.dao.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Post {
  private String id;
  private String name;
}
