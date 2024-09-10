package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedContentErrorDTO
import org.openapitools.models.FeedStatusType

/**
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 * @param rejectedOffersCount Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
 * @param status 
 * @param totalOffersCount Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
 * @param error 
 */
case class FeedContentDTO(rejectedOffersCount: Option[Long],
                status: Option[FeedStatusType],
                totalOffersCount: Option[Long],
                error: Option[FeedContentErrorDTO]
                )

object FeedContentDTO {
    /**
     * Creates the codec for converting FeedContentDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedContentDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedContentDTO] = deriveEncoder
}
