package model

import play.api.libs.json._

/**
  * Список заказов, статус которых обновился.
  * @param orders Список с обновленными заказами.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOrderStatusesDTO(
  orders: List[UpdateOrderStatusDTO]
)

object UpdateOrderStatusesDTO {
  implicit lazy val updateOrderStatusesDTOJsonFormat: Format[UpdateOrderStatusesDTO] = Json.format[UpdateOrderStatusesDTO]
}

