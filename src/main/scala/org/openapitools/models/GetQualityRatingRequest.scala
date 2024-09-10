package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime

/**
 * Запрос информации по индексу качества.
 * @param dateFrom Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
 * @param dateTo Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
 * @param campaignIds Список идентификаторов магазинов.
 */
case class GetQualityRatingRequest(dateFrom: Option[LocalDateTime],
                dateTo: Option[LocalDateTime],
                campaignIds: Set[Long]
                )

object GetQualityRatingRequest {
    /**
     * Creates the codec for converting GetQualityRatingRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetQualityRatingRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetQualityRatingRequest] = deriveEncoder
}
