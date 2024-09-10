package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import ShipmentStatusChangeDTO._

case class ShipmentStatusChangeDTO (
  status: Option[ShipmentStatusType],
/* Описание статуса отгрузки. */
  description: Option[String],
/* Время последнего изменения статуса отгрузки. */
  updateTime: Option[OffsetDateTime])

object ShipmentStatusChangeDTO {
  import DateTimeCodecs._

  implicit val ShipmentStatusChangeDTOCodecJson: CodecJson[ShipmentStatusChangeDTO] = CodecJson.derive[ShipmentStatusChangeDTO]
  implicit val ShipmentStatusChangeDTODecoder: EntityDecoder[ShipmentStatusChangeDTO] = jsonOf[ShipmentStatusChangeDTO]
  implicit val ShipmentStatusChangeDTOEncoder: EntityEncoder[ShipmentStatusChangeDTO] = jsonEncoderOf[ShipmentStatusChangeDTO]
}
