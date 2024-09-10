package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLabelDTO._

case class OrderLabelDTO (
  /* Идентификатор заказа. */
  orderId: Long,
/* Количество коробок в заказе. */
  placesNumber: Integer,
/* URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  */
  url: String,
/* Информация на ярлыке. */
  parcelBoxLabels: List[ParcelBoxLabelDTO])

object OrderLabelDTO {
  import DateTimeCodecs._

  implicit val OrderLabelDTOCodecJson: CodecJson[OrderLabelDTO] = CodecJson.derive[OrderLabelDTO]
  implicit val OrderLabelDTODecoder: EntityDecoder[OrderLabelDTO] = jsonOf[OrderLabelDTO]
  implicit val OrderLabelDTOEncoder: EntityEncoder[OrderLabelDTO] = jsonEncoderOf[OrderLabelDTO]
}
