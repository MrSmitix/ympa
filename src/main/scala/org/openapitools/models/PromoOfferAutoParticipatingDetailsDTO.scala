package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 * @param campaignIds Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. 
 */
case class PromoOfferAutoParticipatingDetailsDTO(campaignIds: Option[Seq[Long]]
                )

object PromoOfferAutoParticipatingDetailsDTO {
    /**
     * Creates the codec for converting PromoOfferAutoParticipatingDetailsDTO from and to JSON.
     */
    implicit val decoder: Decoder[PromoOfferAutoParticipatingDetailsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromoOfferAutoParticipatingDetailsDTO] = deriveEncoder
}
