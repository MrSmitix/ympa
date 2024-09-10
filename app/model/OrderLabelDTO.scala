package model

import play.api.libs.json._

/**
  * Данные для печати ярлыка.
  * @param orderId Идентификатор заказа.
  * @param placesNumber Количество коробок в заказе.
  * @param url URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
  * @param parcelBoxLabels Информация на ярлыке.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderLabelDTO(
  orderId: Long,
  placesNumber: Int,
  url: String,
  parcelBoxLabels: List[ParcelBoxLabelDTO]
)

object OrderLabelDTO {
  implicit lazy val orderLabelDTOJsonFormat: Format[OrderLabelDTO] = Json.format[OrderLabelDTO]
}

