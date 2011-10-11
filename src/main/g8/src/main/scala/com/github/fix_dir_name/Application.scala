package $packagename$

import com.github.scala.android.crud.{CrudBackupAgent, CrudApplication}

/**
 * The fill_in_subdir application
 */

object $appnamewithoutspaces$Application extends CrudApplication {
  val name = "$name$"

  def allEntities = List($entitynamewithoutspaces$CrudType) //TODO Add other entities here
}

class $appnamewithoutspaces$BackupAgent extends CrudBackupAgent($appnamewithoutspaces$Application)