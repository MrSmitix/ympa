package model

import play.api.libs.json._

/**
  * День недели:  * `MONDAY` — понедельник. * `TUESDAY` — вторник. * `WEDNESDAY` — среда. * `THURSDAY` — четверг. * `FRIDAY` — пятница. * `SATURDAY` — суббота. * `SUNDAY` — воскресенье. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DayOfWeekType(
)

object DayOfWeekType {
  implicit lazy val dayOfWeekTypeJsonFormat: Format[DayOfWeekType] = Json.format[DayOfWeekType]
}

