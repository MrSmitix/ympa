package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TurnoverDTO._

case class TurnoverDTO (
  turnover: TurnoverType,
/* Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html) */
  turnoverDays: Option[Double])

object TurnoverDTO {
  import DateTimeCodecs._

  implicit val TurnoverDTOCodecJson: CodecJson[TurnoverDTO] = CodecJson.derive[TurnoverDTO]
  implicit val TurnoverDTODecoder: EntityDecoder[TurnoverDTO] = jsonOf[TurnoverDTO]
  implicit val TurnoverDTOEncoder: EntityEncoder[TurnoverDTO] = jsonEncoderOf[TurnoverDTO]
}
