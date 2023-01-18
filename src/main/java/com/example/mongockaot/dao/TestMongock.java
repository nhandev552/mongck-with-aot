package com.example.mongockaot.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "testMongock")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@TypeAlias("testMongock")
public class TestMongock implements Serializable {
  @Id
  private String id;
  private String data;
}
