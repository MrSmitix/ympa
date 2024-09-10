package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
 */
case class OfferCampaignStatusType()

object OfferCampaignStatusType {
    /**
     * Creates the codec for converting OfferCampaignStatusType from and to JSON.
     */
    implicit val decoder: Decoder[OfferCampaignStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferCampaignStatusType] = deriveEncoder
}
