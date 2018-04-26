package io.sdkman.changelogs

import com.github.mongobee.changeset.{ChangeLog, ChangeSet}
import com.mongodb.client.MongoDatabase

@ChangeLog(order = "009")
class VisualVmMigrations {

  @ChangeSet(order = "001", id = "001-add_visualvm_1_4_1", author = "vpavic")
  def migration001(implicit db: MongoDatabase) = {
    List(
      Version("visualvm", "1.4.1", "https://github.com/visualvm/visualvm.src/releases/download/1.4.1/visualvm_141.zip")
    ).insert()
    setCandidateDefault("visualvm", "1.4.1")
  }

}
