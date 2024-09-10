package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.QuantumDTO

/**
 * Информация о новой цене на товар.
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param quantum 
 * @param available Есть ли товар в продаже. 
 */
case class BaseCampaignOfferDTO(offerId: String,
                quantum: Option[QuantumDTO],
                available: Option[Boolean]
                )

object BaseCampaignOfferDTO {
    /**
     * Creates the codec for converting BaseCampaignOfferDTO from and to JSON.
     */
    implicit val decoder: Decoder[BaseCampaignOfferDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[BaseCampaignOfferDTO] = deriveEncoder
}
