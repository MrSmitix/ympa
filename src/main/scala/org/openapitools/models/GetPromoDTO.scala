package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ChannelType
import org.openapitools.models.GetPromoAssortmentInfoDTO
import org.openapitools.models.GetPromoBestsellerInfoDTO
import org.openapitools.models.GetPromoConstraintsDTO
import org.openapitools.models.GetPromoMechanicsInfoDTO
import org.openapitools.models.PromoPeriodDTO
import scala.collection.immutable.Seq

/**
 * Информация об акции.
 * @param id Идентификатор акции.
 * @param name Название акции.
 * @param period 
 * @param participating Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 * @param assortmentInfo 
 * @param mechanicsInfo 
 * @param bestsellerInfo 
 * @param channels Список каналов продвижения товаров.
 * @param constraints 
 */
case class GetPromoDTO(id: String,
                name: String,
                period: PromoPeriodDTO,
                participating: Boolean,
                assortmentInfo: GetPromoAssortmentInfoDTO,
                mechanicsInfo: GetPromoMechanicsInfoDTO,
                bestsellerInfo: GetPromoBestsellerInfoDTO,
                channels: Option[Seq[ChannelType]],
                constraints: Option[GetPromoConstraintsDTO]
                )

object GetPromoDTO {
    /**
     * Creates the codec for converting GetPromoDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetPromoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromoDTO] = deriveEncoder
}
