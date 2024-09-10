package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.TimeUnitType

/**
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 * @param timePeriod Продолжительность в указанных единицах.
 * @param timeUnit 
 * @param comment Комментарий.
 */
case class TimePeriodDTO(timePeriod: Int,
                timeUnit: TimeUnitType,
                comment: Option[String]
                )

object TimePeriodDTO {
    /**
     * Creates the codec for converting TimePeriodDTO from and to JSON.
     */
    implicit val decoder: Decoder[TimePeriodDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[TimePeriodDTO] = deriveEncoder
}
