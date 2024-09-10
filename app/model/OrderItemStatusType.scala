package model

import play.api.libs.json._

/**
  * Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderItemStatusType(
)

object OrderItemStatusType {
  implicit lazy val orderItemStatusTypeJsonFormat: Format[OrderItemStatusType] = Json.format[OrderItemStatusType]
}

