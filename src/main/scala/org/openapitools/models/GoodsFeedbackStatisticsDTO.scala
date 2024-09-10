package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статистическая информация по отзыву.
 * @param rating Оценка товара.
 * @param commentsCount Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
 * @param recommended Рекомендуют ли этот товар.
 * @param paidAmount Количество баллов Плюса, которое автор получил за отзыв.
 */
case class GoodsFeedbackStatisticsDTO(rating: Int,
                commentsCount: Long,
                recommended: Option[Boolean],
                paidAmount: Option[Long]
                )

object GoodsFeedbackStatisticsDTO {
    /**
     * Creates the codec for converting GoodsFeedbackStatisticsDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsFeedbackStatisticsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsFeedbackStatisticsDTO] = deriveEncoder
}
