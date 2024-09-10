package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenerateReportDTO._

case class GenerateReportDTO (
  /* Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета. */
  reportId: String,
/* Ожидаемая продолжительность генерации в миллисекундах. */
  estimatedGenerationTime: Long)

object GenerateReportDTO {
  import DateTimeCodecs._

  implicit val GenerateReportDTOCodecJson: CodecJson[GenerateReportDTO] = CodecJson.derive[GenerateReportDTO]
  implicit val GenerateReportDTODecoder: EntityDecoder[GenerateReportDTO] = jsonOf[GenerateReportDTO]
  implicit val GenerateReportDTOEncoder: EntityEncoder[GenerateReportDTO] = jsonEncoderOf[GenerateReportDTO]
}
