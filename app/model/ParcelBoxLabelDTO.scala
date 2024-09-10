package model

import play.api.libs.json._

/**
  * Информация о ярлыке для коробки.
  * @param url Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
  * @param supplierName Юридическое название магазина.
  * @param deliveryServiceName Юридическое название службы доставки.
  * @param orderId Идентификатор заказа в системе Маркета.
  * @param orderNum Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
  * @param recipientName Фамилия и инициалы получателя заказа.
  * @param boxId Идентификатор коробки.
  * @param fulfilmentId Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
  * @param place Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
  * @param weight {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
  * @param deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  * @param deliveryAddress Адрес получателя.
  * @param shipmentDate Дата отгрузки в формате `dd.MM.yyyy`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ParcelBoxLabelDTO(
  url: String,
  supplierName: String,
  deliveryServiceName: String,
  orderId: Long,
  orderNum: String,
  recipientName: String,
  boxId: Long,
  fulfilmentId: String,
  place: String,
  weight: String,
  deliveryServiceId: String,
  deliveryAddress: Option[String],
  shipmentDate: Option[String]
)

object ParcelBoxLabelDTO {
  implicit lazy val parcelBoxLabelDTOJsonFormat: Format[ParcelBoxLabelDTO] = Json.format[ParcelBoxLabelDTO]
}

