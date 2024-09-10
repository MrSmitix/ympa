package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import ReportInfoDTO._

case class ReportInfoDTO (
  status: ReportStatusType,
subStatus: Option[ReportSubStatusType],
/* Дата и время запроса на генерацию. */
  generationRequestedAt: OffsetDateTime,
/* Дата и время завершения генерации. */
  generationFinishedAt: Option[OffsetDateTime],
/* Ссылка на готовый отчет. */
  file: Option[String],
/* Ожидаемая продолжительность генерации в миллисекундах. */
  estimatedGenerationTime: Option[Long])

object ReportInfoDTO {
  import DateTimeCodecs._

  implicit val ReportInfoDTOCodecJson: CodecJson[ReportInfoDTO] = CodecJson.derive[ReportInfoDTO]
  implicit val ReportInfoDTODecoder: EntityDecoder[ReportInfoDTO] = jsonOf[ReportInfoDTO]
  implicit val ReportInfoDTOEncoder: EntityEncoder[ReportInfoDTO] = jsonEncoderOf[ReportInfoDTO]
}
