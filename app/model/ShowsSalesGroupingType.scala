package model

import play.api.libs.json._

/**
  * Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ShowsSalesGroupingType(
)

object ShowsSalesGroupingType {
  implicit lazy val showsSalesGroupingTypeJsonFormat: Format[ShowsSalesGroupingType] = Json.format[ShowsSalesGroupingType]
}

