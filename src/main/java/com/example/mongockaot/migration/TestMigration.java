package com.example.mongockaot.migration;

import com.example.mongockaot.dao.TestMongock;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v4.decorator.impl.MongockTemplate;

@ChangeLog
/** Order format: DDMMYYYY_HH:mm:SS */
public class TestMigration {

  @ChangeSet(order = "20220312_11:26:06", id = "addDocument", author = "me")
  public void addDocument(MongockTemplate mongoTemplate) {
    TestMongock testMongock = new TestMongock();
    testMongock.setData("Test");
    mongoTemplate.save(testMongock);
  }
}
