package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import GenerateGoodsTurnoverRequest._

case class GenerateGoodsTurnoverRequest (
  /* Идентификатор кампании. */
  campaignId: Long,
/* Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата. */
  date: Option[LocalDate])

object GenerateGoodsTurnoverRequest {
  import DateTimeCodecs._

  implicit val GenerateGoodsTurnoverRequestCodecJson: CodecJson[GenerateGoodsTurnoverRequest] = CodecJson.derive[GenerateGoodsTurnoverRequest]
  implicit val GenerateGoodsTurnoverRequestDecoder: EntityDecoder[GenerateGoodsTurnoverRequest] = jsonOf[GenerateGoodsTurnoverRequest]
  implicit val GenerateGoodsTurnoverRequestEncoder: EntityEncoder[GenerateGoodsTurnoverRequest] = jsonEncoderOf[GenerateGoodsTurnoverRequest]
}
