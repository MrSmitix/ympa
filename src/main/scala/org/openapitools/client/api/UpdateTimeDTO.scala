package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import UpdateTimeDTO._

case class UpdateTimeDTO (
  /* Время последнего обновления. */
  updatedAt: OffsetDateTime)

object UpdateTimeDTO {
  import DateTimeCodecs._

  implicit val UpdateTimeDTOCodecJson: CodecJson[UpdateTimeDTO] = CodecJson.derive[UpdateTimeDTO]
  implicit val UpdateTimeDTODecoder: EntityDecoder[UpdateTimeDTO] = jsonOf[UpdateTimeDTO]
  implicit val UpdateTimeDTOEncoder: EntityEncoder[UpdateTimeDTO] = jsonEncoderOf[UpdateTimeDTO]
}
