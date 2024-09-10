package model

import play.api.libs.json._

/**
  * Заказ.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderStatusChangeDTO(
  status: OrderStatusType,
  substatus: Option[OrderSubstatusType],
  delivery: Option[OrderStatusChangeDeliveryDTO]
)

object OrderStatusChangeDTO {
  implicit lazy val orderStatusChangeDTOJsonFormat: Format[OrderStatusChangeDTO] = Json.format[OrderStatusChangeDTO]
}

