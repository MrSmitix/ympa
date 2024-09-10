package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.FeedbackDTO
import org.openapitools.models.ScrollingPagerDTO
import scala.collection.immutable.Seq

/**
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 * @param paging 
 * @param feedbackList Список отзывов.  Содержит не более 20 отзывов. 
 */
case class FeedbackListDTO(paging: Option[ScrollingPagerDTO],
                feedbackList: Seq[FeedbackDTO]
                )

object FeedbackListDTO {
    /**
     * Creates the codec for converting FeedbackListDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackListDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackListDTO] = deriveEncoder
}
