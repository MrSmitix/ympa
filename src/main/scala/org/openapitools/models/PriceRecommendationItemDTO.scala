package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal

/**
 * Рекомендованная цена.
 * @param campaignId Идентификатор кампании.
 * @param price Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
 */
case class PriceRecommendationItemDTO(campaignId: Long,
                price: BigDecimal
                )

object PriceRecommendationItemDTO {
    /**
     * Creates the codec for converting PriceRecommendationItemDTO from and to JSON.
     */
    implicit val decoder: Decoder[PriceRecommendationItemDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PriceRecommendationItemDTO] = deriveEncoder
}
