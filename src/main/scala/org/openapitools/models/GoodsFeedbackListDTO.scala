package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ForwardScrollingPagerDTO
import org.openapitools.models.GoodsFeedbackDTO
import scala.collection.immutable.Seq

/**
 * Список отзывов о товарах. 
 * @param feedbacks Список отзывов.
 * @param paging 
 */
case class GoodsFeedbackListDTO(feedbacks: Seq[GoodsFeedbackDTO],
                paging: Option[ForwardScrollingPagerDTO]
                )

object GoodsFeedbackListDTO {
    /**
     * Creates the codec for converting GoodsFeedbackListDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsFeedbackListDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsFeedbackListDTO] = deriveEncoder
}
