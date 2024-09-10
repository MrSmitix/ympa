package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferProcessingNoteDTO
import org.openapitools.models.OfferProcessingStatusType
import scala.collection.immutable.Seq

/**
 * Информация о статусе публикации товара на Маркете.
 * @param status 
 * @param notes Причины, по которым товар не прошел модерацию.
 */
case class OfferProcessingStateDTO(status: Option[OfferProcessingStatusType],
                notes: Option[Seq[OfferProcessingNoteDTO]]
                )

object OfferProcessingStateDTO {
    /**
     * Creates the codec for converting OfferProcessingStateDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferProcessingStateDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferProcessingStateDTO] = deriveEncoder
}
