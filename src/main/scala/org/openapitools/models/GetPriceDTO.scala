package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.BigDecimal
import org.openapitools.models.CurrencyType

/**
 * Цена с указанием времени последнего обновления.
 * @param value Значение.
 * @param currencyId 
 * @param updatedAt Время последнего обновления.
 */
case class GetPriceDTO(value: BigDecimal,
                currencyId: CurrencyType,
                updatedAt: ZonedDateTime
                )

object GetPriceDTO {
    /**
     * Creates the codec for converting GetPriceDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetPriceDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPriceDTO] = deriveEncoder
}
