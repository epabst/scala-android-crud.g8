package com.github.fill_in_dir.fill_in_subdir

import com.github.scala_android.crud.{CrudBackupAgent, CrudApplication}

/**
 * The fill_in_subdir application
 * @author Eric Pabst (epabst@gmail.com)
 * Date: 3/31/11
 * Time: 4:53 PM
 */

object SampleApplication extends CrudApplication {
  val name = "Sample Application"

  def allEntities = List(BookCrudType) //TODO Add other entities here
}

class SampleBackupAgent extends CrudBackupAgent(SampleApplication)