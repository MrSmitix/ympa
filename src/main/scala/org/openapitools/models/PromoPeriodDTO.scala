package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime

/**
 * Время проведения акции.
 * @param dateTimeFrom Дата и время начала акции.
 * @param dateTimeTo Дата и время окончания акции.
 */
case class PromoPeriodDTO(dateTimeFrom: ZonedDateTime,
                dateTimeTo: ZonedDateTime
                )

object PromoPeriodDTO {
    /**
     * Creates the codec for converting PromoPeriodDTO from and to JSON.
     */
    implicit val decoder: Decoder[PromoPeriodDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromoPeriodDTO] = deriveEncoder
}
