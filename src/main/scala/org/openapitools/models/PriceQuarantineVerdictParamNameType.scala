package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Имя параметра причины скрытия товара по цене.  * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин. * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`). * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`). * `CURRENCY` — валюта. 
 */
case class PriceQuarantineVerdictParamNameType()

object PriceQuarantineVerdictParamNameType {
    /**
     * Creates the codec for converting PriceQuarantineVerdictParamNameType from and to JSON.
     */
    implicit val decoder: Decoder[PriceQuarantineVerdictParamNameType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PriceQuarantineVerdictParamNameType] = deriveEncoder
}
