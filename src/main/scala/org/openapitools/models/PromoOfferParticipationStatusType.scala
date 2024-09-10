package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус товара в акции:  * `AUTO` — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * `PARTIALLY_AUTO` — добавлен автоматически у части магазинов.  * `MANUAL` — добавлен вручную.  * `NOT_PARTICIPATING` — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */
case class PromoOfferParticipationStatusType()

object PromoOfferParticipationStatusType {
    /**
     * Creates the codec for converting PromoOfferParticipationStatusType from and to JSON.
     */
    implicit val decoder: Decoder[PromoOfferParticipationStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromoOfferParticipationStatusType] = deriveEncoder
}
