package $packagename$

import com.github.scala.android.crud._
import persistence.CursorField._
import view.ViewField._
import persistence.PersistedType._
//import java.util.Date
//import com.github.scala.android.crud.ParentField._

/**
 * A CRUD type for $entitynamewithoutspaces$.
 */

object $entitynamewithoutspaces$CrudType extends CrudType with SQLiteCrudType {
  def entityName = "$entitynamewithoutspaces$"

  def valueFields = List(
    persisted[String]("name") + viewId(classOf[R], "name", textView) /*,

    here are some sample fields

    foreignKey(OtherCrudType),

    persisted[MyEnum.Value]("myFieldName")(enumStringType[MyEnum.Value](MyEnum)) +
          viewId(classOf[R], "myFieldName", enumerationView(MyEnum)),

    persisted[Int]("myIntField") + viewId(classOf[R], "myIntField", intView),

    persisted[Date]("myDateField") +
      viewId[Date](classOf[R], "myDateField", dateView)
  */
  )

  def activityClass = classOf[$entitynamewithoutspaces$Activity]
  def listActivityClass = classOf[$entitynamewithoutspaces$ListActivity]

  def cancelItemString = res.R.string.cancel_item
  def editItemString = R.string.edit_entity
  def addItemString = R.string.add_entity
}

class $entitynamewithoutspaces$ListActivity extends CrudListActivity($entitynamewithoutspaces$CrudType, $appnamewithoutspaces$Application)
class $entitynamewithoutspaces$Activity extends CrudActivity($entitynamewithoutspaces$CrudType, $appnamewithoutspaces$Application)