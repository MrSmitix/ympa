package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.TurnoverType

/**
 * Информация об оборачиваемости товара.
 * @param turnover 
 * @param turnoverDays Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
 */
case class TurnoverDTO(turnover: TurnoverType,
                turnoverDays: Option[Double]
                )

object TurnoverDTO {
    /**
     * Creates the codec for converting TurnoverDTO from and to JSON.
     */
    implicit val decoder: Decoder[TurnoverDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[TurnoverDTO] = deriveEncoder
}
