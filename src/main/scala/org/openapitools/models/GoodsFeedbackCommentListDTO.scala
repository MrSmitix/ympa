package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ForwardScrollingPagerDTO
import org.openapitools.models.GoodsFeedbackCommentDTO
import scala.collection.immutable.Seq

/**
 * Комментарии к отзыву.
 * @param comments Список комментариев.
 * @param paging 
 */
case class GoodsFeedbackCommentListDTO(comments: Seq[GoodsFeedbackCommentDTO],
                paging: Option[ForwardScrollingPagerDTO]
                )

object GoodsFeedbackCommentListDTO {
    /**
     * Creates the codec for converting GoodsFeedbackCommentListDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsFeedbackCommentListDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsFeedbackCommentListDTO] = deriveEncoder
}
