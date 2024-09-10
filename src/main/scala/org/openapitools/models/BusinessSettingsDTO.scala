package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CurrencyType

/**
 * Настройки кабинета.
 * @param onlyDefaultPrice Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
 * @param currency 
 */
case class BusinessSettingsDTO(onlyDefaultPrice: Option[Boolean],
                currency: Option[CurrencyType]
                )

object BusinessSettingsDTO {
    /**
     * Creates the codec for converting BusinessSettingsDTO from and to JSON.
     */
    implicit val decoder: Decoder[BusinessSettingsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessSettingsDTO] = deriveEncoder
}
