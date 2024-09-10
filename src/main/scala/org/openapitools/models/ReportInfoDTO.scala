package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.ReportStatusType
import org.openapitools.models.ReportSubStatusType

/**
 * Статус генерации и ссылка на готовый отчет.
 * @param status 
 * @param subStatus 
 * @param generationRequestedAt Дата и время запроса на генерацию.
 * @param generationFinishedAt Дата и время завершения генерации.
 * @param file Ссылка на готовый отчет.
 * @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.
 */
case class ReportInfoDTO(status: ReportStatusType,
                subStatus: Option[ReportSubStatusType],
                generationRequestedAt: ZonedDateTime,
                generationFinishedAt: Option[ZonedDateTime],
                file: Option[String],
                estimatedGenerationTime: Option[Long]
                )

object ReportInfoDTO {
    /**
     * Creates the codec for converting ReportInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[ReportInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReportInfoDTO] = deriveEncoder
}
