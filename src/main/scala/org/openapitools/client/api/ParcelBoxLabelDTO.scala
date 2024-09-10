package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ParcelBoxLabelDTO._

case class ParcelBoxLabelDTO (
  /* Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  */
  url: String,
/* Юридическое название магазина. */
  supplierName: String,
/* Юридическое название службы доставки. */
  deliveryServiceName: String,
/* Идентификатор заказа в системе Маркета. */
  orderId: Long,
/* Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина.  */
  orderNum: String,
/* Фамилия и инициалы получателя заказа. */
  recipientName: String,
/* Идентификатор коробки. */
  boxId: Long,
/* Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д.  */
  fulfilmentId: String,
/* Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`.  */
  place: String,
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`.  */
  weight: String,
/* Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). */
  deliveryServiceId: String,
/* Адрес получателя. */
  deliveryAddress: Option[String],
/* Дата отгрузки в формате `dd.MM.yyyy`. */
  shipmentDate: Option[String])

object ParcelBoxLabelDTO {
  import DateTimeCodecs._

  implicit val ParcelBoxLabelDTOCodecJson: CodecJson[ParcelBoxLabelDTO] = CodecJson.derive[ParcelBoxLabelDTO]
  implicit val ParcelBoxLabelDTODecoder: EntityDecoder[ParcelBoxLabelDTO] = jsonOf[ParcelBoxLabelDTO]
  implicit val ParcelBoxLabelDTOEncoder: EntityEncoder[ParcelBoxLabelDTO] = jsonEncoderOf[ParcelBoxLabelDTO]
}
