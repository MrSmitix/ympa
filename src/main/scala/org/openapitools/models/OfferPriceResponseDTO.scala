package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.PriceDTO

/**
 * Информация об установленной цене на товар.
 * @param id Идентификатор предложения из прайс-листа.
 * @param price 
 * @param marketSku SKU на Маркете.
 * @param updatedAt Дата и время последнего обновления цены на товар.
 */
case class OfferPriceResponseDTO(id: Option[String],
                price: Option[PriceDTO],
                marketSku: Option[Long],
                updatedAt: Option[ZonedDateTime]
                )

object OfferPriceResponseDTO {
    /**
     * Creates the codec for converting OfferPriceResponseDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferPriceResponseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferPriceResponseDTO] = deriveEncoder
}
