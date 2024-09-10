package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TimePeriodDTO._

case class TimePeriodDTO (
  /* Продолжительность в указанных единицах. */
  timePeriod: Integer,
timeUnit: TimeUnitType,
/* Комментарий. */
  comment: Option[String])

object TimePeriodDTO {
  import DateTimeCodecs._

  implicit val TimePeriodDTOCodecJson: CodecJson[TimePeriodDTO] = CodecJson.derive[TimePeriodDTO]
  implicit val TimePeriodDTODecoder: EntityDecoder[TimePeriodDTO] = jsonOf[TimePeriodDTO]
  implicit val TimePeriodDTOEncoder: EntityEncoder[TimePeriodDTO] = jsonEncoderOf[TimePeriodDTO]
}
