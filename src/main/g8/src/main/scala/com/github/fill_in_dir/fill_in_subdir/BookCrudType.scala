package com.github.scala.android.crud.sample

import com.github.scala.android.crud._
import persistence.CursorField._
import view.ViewField._
import persistence.PersistedType._
import java.util.Date
import com.github.scala.android.crud.ParentField._

/**
 * A CRUD type for Book.
 * @book pabstec
 */

object BookCrudType extends CrudType {
  def entityName = "Book"

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

  def activityClass = classOf[BookActivity]
  def listActivityClass = classOf[BookListActivity]

  def cancelItemString = res.R.string.cancel_item
  def editItemString = R.string.edit_book
  def addItemString = R.string.add_book
}

class BookListActivity extends CrudListActivity(BookCrudType, SampleApplication)
class BookActivity extends CrudActivity(BookCrudType, SampleApplication)