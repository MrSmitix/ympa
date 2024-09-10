package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CurrencyType

/**
 * Цена с указанием скидки, валюты и времени последнего обновления.
 * @param value Цена на товар.
 * @param discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
 * @param currencyId 
 * @param vat Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
 */
case class PriceDTO(value: Option[BigDecimal],
                discountBase: Option[BigDecimal],
                currencyId: Option[CurrencyType],
                vat: Option[Int]
                )

object PriceDTO {
    /**
     * Creates the codec for converting PriceDTO from and to JSON.
     */
    implicit val decoder: Decoder[PriceDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PriceDTO] = deriveEncoder
}
