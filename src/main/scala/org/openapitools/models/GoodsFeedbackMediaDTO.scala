package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Фото и видео.
 * @param photos Ссылки на фото.
 * @param videos Ссылки на видео.
 */
case class GoodsFeedbackMediaDTO(photos: Option[Seq[String]],
                videos: Option[Seq[String]]
                )

object GoodsFeedbackMediaDTO {
    /**
     * Creates the codec for converting GoodsFeedbackMediaDTO from and to JSON.
     */
    implicit val decoder: Decoder[GoodsFeedbackMediaDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoodsFeedbackMediaDTO] = deriveEncoder
}
