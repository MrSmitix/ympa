package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о товарах в акции.
 * @param activeOffers Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 * @param potentialOffers Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
 * @param processing Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
 */
case class GetPromoAssortmentInfoDTO(activeOffers: Int,
                potentialOffers: Option[Int],
                processing: Option[Boolean]
                )

object GetPromoAssortmentInfoDTO {
    /**
     * Creates the codec for converting GetPromoAssortmentInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetPromoAssortmentInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromoAssortmentInfoDTO] = deriveEncoder
}
