package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.PriceDTO

/**
 * Информация об установленной цене.
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param price 
 * @param updatedAt Дата и время последнего обновления цены.
 */
case class OfferPriceByOfferIdsResponseDTO(offerId: Option[String],
                price: Option[PriceDTO],
                updatedAt: Option[ZonedDateTime]
                )

object OfferPriceByOfferIdsResponseDTO {
    /**
     * Creates the codec for converting OfferPriceByOfferIdsResponseDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferPriceByOfferIdsResponseDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferPriceByOfferIdsResponseDTO] = deriveEncoder
}
