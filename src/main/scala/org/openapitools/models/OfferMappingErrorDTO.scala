package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferMappingErrorType

/**
 * Текст ошибки.
 * @param _type 
 * @param parameterId Идентификатор характеристики, с которой связана ошибка.
 * @param message Текст ошибки.
 */
case class OfferMappingErrorDTO(_type: OfferMappingErrorType,
                parameterId: Option[Long],
                message: String
                )

object OfferMappingErrorDTO {
    /**
     * Creates the codec for converting OfferMappingErrorDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferMappingErrorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferMappingErrorDTO] = deriveEncoder
}
