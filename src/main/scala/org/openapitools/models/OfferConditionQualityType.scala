package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
 */
case class OfferConditionQualityType()

object OfferConditionQualityType {
    /**
     * Creates the codec for converting OfferConditionQualityType from and to JSON.
     */
    implicit val decoder: Decoder[OfferConditionQualityType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferConditionQualityType] = deriveEncoder
}
