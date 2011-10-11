package $packagename$

import com.github.scala.android.crud.{CrudType, CrudBackupAgent, CrudApplication}

/**
  * The $name$ application.
  */

object $appnamewithoutspaces$Application extends CrudApplication {
  val name = "$name$"

  def allEntities = List[CrudType]($entitynamewithoutspaces$CrudType) //TODO Add other entities here
}

/**
  *  The Backup Agent that works with the Google Android Backup Service.
  */ 
class $appnamewithoutspaces$BackupAgent extends CrudBackupAgent($appnamewithoutspaces$Application)
