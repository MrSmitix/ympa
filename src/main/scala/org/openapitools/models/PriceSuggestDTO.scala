package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.PriceSuggestType

/**
 * Тип цены.
 * @param _type 
 * @param price Цена в рублях.
 */
case class PriceSuggestDTO(_type: Option[PriceSuggestType],
                price: Option[BigDecimal]
                )

object PriceSuggestDTO {
    /**
     * Creates the codec for converting PriceSuggestDTO from and to JSON.
     */
    implicit val decoder: Decoder[PriceSuggestDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PriceSuggestDTO] = deriveEncoder
}
