package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import PromoPeriodDTO._

case class PromoPeriodDTO (
  /* Дата и время начала акции. */
  dateTimeFrom: OffsetDateTime,
/* Дата и время окончания акции. */
  dateTimeTo: OffsetDateTime)

object PromoPeriodDTO {
  import DateTimeCodecs._

  implicit val PromoPeriodDTOCodecJson: CodecJson[PromoPeriodDTO] = CodecJson.derive[PromoPeriodDTO]
  implicit val PromoPeriodDTODecoder: EntityDecoder[PromoPeriodDTO] = jsonOf[PromoPeriodDTO]
  implicit val PromoPeriodDTOEncoder: EntityEncoder[PromoPeriodDTO] = jsonEncoderOf[PromoPeriodDTO]
}
