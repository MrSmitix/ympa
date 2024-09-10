package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime

/**
 * Данные, необходимые для генерации отчета. 
 * @param campaignId Идентификатор кампании.
 * @param date Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
 */
case class GenerateGoodsTurnoverRequest(campaignId: Long,
                date: Option[LocalDateTime]
                )

object GenerateGoodsTurnoverRequest {
    /**
     * Creates the codec for converting GenerateGoodsTurnoverRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateGoodsTurnoverRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateGoodsTurnoverRequest] = deriveEncoder
}
