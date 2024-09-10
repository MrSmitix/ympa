package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
 */
case class GoodsFeedbackCommentStatusType()

object GoodsFeedbackCommentStatusType {
    /**
     * Creates the codec for converting GoodsFeedbackCommentStatusType from and to JSON.
     */
    implicit val decoder: Decoder[GoodsFeedbackCommentStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsFeedbackCommentStatusType] = deriveEncoder
}
