package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferProcessingNoteType

/**
 * Причины, по которым товар не прошел модерацию.
 * @param _type 
 * @param payload Дополнительная информация о причине отклонения товара. 
 */
case class OfferProcessingNoteDTO(_type: Option[OfferProcessingNoteType],
                payload: Option[String]
                )

object OfferProcessingNoteDTO {
    /**
     * Creates the codec for converting OfferProcessingNoteDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferProcessingNoteDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferProcessingNoteDTO] = deriveEncoder
}
