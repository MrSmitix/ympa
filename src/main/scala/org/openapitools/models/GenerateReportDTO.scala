package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 * @param reportId Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 * @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.
 */
case class GenerateReportDTO(reportId: String,
                estimatedGenerationTime: Long
                )

object GenerateReportDTO {
    /**
     * Creates the codec for converting GenerateReportDTO from and to JSON.
     */
    implicit val decoder: Decoder[GenerateReportDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateReportDTO] = deriveEncoder
}
