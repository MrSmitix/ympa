package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import GenerateBoostConsolidatedRequest._

case class GenerateBoostConsolidatedRequest (
  /* Идентификатор бизнеса. */
  businessId: Long,
/* Начало периода, включительно. */
  dateFrom: LocalDate,
/* Конец периода, включительно. */
  dateTo: LocalDate)

object GenerateBoostConsolidatedRequest {
  import DateTimeCodecs._

  implicit val GenerateBoostConsolidatedRequestCodecJson: CodecJson[GenerateBoostConsolidatedRequest] = CodecJson.derive[GenerateBoostConsolidatedRequest]
  implicit val GenerateBoostConsolidatedRequestDecoder: EntityDecoder[GenerateBoostConsolidatedRequest] = jsonOf[GenerateBoostConsolidatedRequest]
  implicit val GenerateBoostConsolidatedRequestEncoder: EntityEncoder[GenerateBoostConsolidatedRequest] = jsonEncoderOf[GenerateBoostConsolidatedRequest]
}
