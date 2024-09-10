package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferContentErrorType

/**
 * Текст ошибки.
 * @param _type 
 * @param parameterId Идентификатор характеристики, с которой связана ошибка.
 * @param message Текст ошибки.
 */
case class OfferContentErrorDTO(_type: OfferContentErrorType,
                parameterId: Option[Long],
                message: String
                )

object OfferContentErrorDTO {
    /**
     * Creates the codec for converting OfferContentErrorDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferContentErrorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferContentErrorDTO] = deriveEncoder
}
