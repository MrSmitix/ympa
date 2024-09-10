package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Фильтр для товаров, которые добавлены в акцию вручную:  * `MANUALLY_ADDED` — товары, которые добавлены вручную.  * `NOT_MANUALLY_ADDED`— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр `statusType`, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */
case class PromoOfferParticipationStatusFilterType()

object PromoOfferParticipationStatusFilterType {
    /**
     * Creates the codec for converting PromoOfferParticipationStatusFilterType from and to JSON.
     */
    implicit val decoder: Decoder[PromoOfferParticipationStatusFilterType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromoOfferParticipationStatusFilterType] = deriveEncoder
}
