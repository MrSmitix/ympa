package model

import play.api.libs.json._

/**
  * Информация по заказу.
  * @param id Идентификатор заказа.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderStateDTO(
  id: Long,
  status: OrderStatusType,
  substatus: Option[OrderSubstatusType]
)

object OrderStateDTO {
  implicit lazy val orderStateDTOJsonFormat: Format[OrderStateDTO] = Json.format[OrderStateDTO]
}

