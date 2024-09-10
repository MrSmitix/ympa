package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import ReturnDTO._

case class ReturnDTO (
  /* Идентификатор возврата. */
  id: Option[Long],
/* Номер заказа. */
  orderId: Option[Long],
/* Дата создания возврата клиентом. */
  creationDate: Option[OffsetDateTime],
/* Дата обновления возврата. */
  updateDate: Option[OffsetDateTime],
refundStatus: Option[RefundStatusType],
logisticPickupPoint: Option[LogisticPickupPointDTO],
shipmentRecipientType: Option[RecipientType],
shipmentStatus: Option[ReturnShipmentStatusType],
/* Сумма возврата. */
  refundAmount: Option[Long],
/* Список товаров в возврате. */
  items: List[ReturnItemDTO],
returnType: Option[ReturnType],
/* Используется ли опция **Быстрый возврат денег за дешевый брак**.  */
  fastReturn: Option[Boolean])

object ReturnDTO {
  import DateTimeCodecs._

  implicit val ReturnDTOCodecJson: CodecJson[ReturnDTO] = CodecJson.derive[ReturnDTO]
  implicit val ReturnDTODecoder: EntityDecoder[ReturnDTO] = jsonOf[ReturnDTO]
  implicit val ReturnDTOEncoder: EntityEncoder[ReturnDTO] = jsonEncoderOf[ReturnDTO]
}
