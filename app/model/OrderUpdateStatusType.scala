package model

import play.api.libs.json._

/**
  * Изменился ли статус заказа:  * `OK` — статус изменен.  * `ERROR` — статус не изменен. В этом случае появится сообщение об ошибке в параметре `errorDetails`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderUpdateStatusType(
)

object OrderUpdateStatusType {
  implicit lazy val orderUpdateStatusTypeJsonFormat: Format[OrderUpdateStatusType] = Json.format[OrderUpdateStatusType]
}

