package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CurrencyType

/**
 * Цена с указанием скидки.
 * @param value Значение.
 * @param currencyId 
 * @param discountBase Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
 */
case class UpdatePriceWithDiscountDTO(value: BigDecimal,
                currencyId: CurrencyType,
                discountBase: Option[BigDecimal]
                )

object UpdatePriceWithDiscountDTO {
    /**
     * Creates the codec for converting UpdatePriceWithDiscountDTO from and to JSON.
     */
    implicit val decoder: Decoder[UpdatePriceWithDiscountDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatePriceWithDiscountDTO] = deriveEncoder
}
