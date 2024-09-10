package model

import play.api.libs.json._

/**
  * Детали по товару в заказе.
  * @param itemCount Количество единиц товара.
  * @param updateDate Формат даты: `ДД-ММ-ГГГГ`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderItemDetailDTO(
  itemCount: Option[Long],
  itemStatus: Option[OrderItemStatusType],
  updateDate: Option[String]
)

object OrderItemDetailDTO {
  implicit lazy val orderItemDetailDTOJsonFormat: Format[OrderItemDetailDTO] = Json.format[OrderItemDetailDTO]
}

