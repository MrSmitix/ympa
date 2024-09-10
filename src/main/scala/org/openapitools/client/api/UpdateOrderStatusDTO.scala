package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOrderStatusDTO._

case class UpdateOrderStatusDTO (
  /* Идентификатор заказа. */
  id: Option[Long],
status: Option[OrderStatusType],
substatus: Option[OrderSubstatusType],
updateStatus: Option[OrderUpdateStatusType],
/* Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.  */
  errorDetails: Option[String])

object UpdateOrderStatusDTO {
  import DateTimeCodecs._

  implicit val UpdateOrderStatusDTOCodecJson: CodecJson[UpdateOrderStatusDTO] = CodecJson.derive[UpdateOrderStatusDTO]
  implicit val UpdateOrderStatusDTODecoder: EntityDecoder[UpdateOrderStatusDTO] = jsonOf[UpdateOrderStatusDTO]
  implicit val UpdateOrderStatusDTOEncoder: EntityEncoder[UpdateOrderStatusDTO] = jsonEncoderOf[UpdateOrderStatusDTO]
}
