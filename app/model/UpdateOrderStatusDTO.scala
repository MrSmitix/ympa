package model

import play.api.libs.json._

/**
  * Список заказов.
  * @param id Идентификатор заказа.
  * @param errorDetails Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOrderStatusDTO(
  id: Option[Long],
  status: Option[OrderStatusType],
  substatus: Option[OrderSubstatusType],
  updateStatus: Option[OrderUpdateStatusType],
  errorDetails: Option[String]
)

object UpdateOrderStatusDTO {
  implicit lazy val updateOrderStatusDTOJsonFormat: Format[UpdateOrderStatusDTO] = Json.format[UpdateOrderStatusDTO]
}

