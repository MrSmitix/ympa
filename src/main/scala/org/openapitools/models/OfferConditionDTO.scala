package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferConditionQualityType
import org.openapitools.models.OfferConditionType

/**
 * Состояние уцененного товара. 
 * @param _type 
 * @param quality 
 * @param reason Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
 */
case class OfferConditionDTO(_type: Option[OfferConditionType],
                quality: Option[OfferConditionQualityType],
                reason: Option[String]
                )

object OfferConditionDTO {
    /**
     * Creates the codec for converting OfferConditionDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferConditionDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferConditionDTO] = deriveEncoder
}
