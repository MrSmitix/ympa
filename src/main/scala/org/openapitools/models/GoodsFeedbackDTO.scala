package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.GoodsFeedbackDescriptionDTO
import org.openapitools.models.GoodsFeedbackIdentifiersDTO
import org.openapitools.models.GoodsFeedbackMediaDTO
import org.openapitools.models.GoodsFeedbackStatisticsDTO

/**
 * Отзыв о товаре.
 * @param feedbackId Идентификатор отзыва. 
 * @param createdAt Дата и время создания отзыва.
 * @param needReaction Нужен ли ответ на отзыв.
 * @param identifiers 
 * @param author Имя автора отзыва.
 * @param description 
 * @param media 
 * @param statistics 
 */
case class GoodsFeedbackDTO(feedbackId: Long,
                createdAt: ZonedDateTime,
                needReaction: Boolean,
                identifiers: GoodsFeedbackIdentifiersDTO,
                author: Option[String],
                description: Option[GoodsFeedbackDescriptionDTO],
                media: Option[GoodsFeedbackMediaDTO],
                statistics: GoodsFeedbackStatisticsDTO
                )

object GoodsFeedbackDTO {
    /**
     * Creates the codec for converting GoodsFeedbackDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsFeedbackDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsFeedbackDTO] = deriveEncoder
}
