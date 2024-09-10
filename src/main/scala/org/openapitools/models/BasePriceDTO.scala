package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CurrencyType

/**
 * Цена на товар.
 * @param value Значение.
 * @param currencyId 
 */
case class BasePriceDTO(value: BigDecimal,
                currencyId: CurrencyType
                )

object BasePriceDTO {
    /**
     * Creates the codec for converting BasePriceDTO from and to JSON.
     */
    implicit val decoder: Decoder[BasePriceDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[BasePriceDTO] = deriveEncoder
}
