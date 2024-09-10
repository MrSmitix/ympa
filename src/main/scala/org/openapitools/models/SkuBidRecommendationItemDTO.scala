package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BidRecommendationItemDTO
import org.openapitools.models.PriceRecommendationItemDTO
import scala.collection.immutable.Seq

/**
 * Список товаров с рекомендованными ставками.
 * @param sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param bid Значение ставки.
 * @param bidRecommendations Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
 * @param priceRecommendations Рекомендованные цены.
 */
case class SkuBidRecommendationItemDTO(sku: String,
                bid: Int,
                bidRecommendations: Option[Seq[BidRecommendationItemDTO]],
                priceRecommendations: Option[Seq[PriceRecommendationItemDTO]]
                )

object SkuBidRecommendationItemDTO {
    /**
     * Creates the codec for converting SkuBidRecommendationItemDTO from and to JSON.
     */
    implicit val decoder: Decoder[SkuBidRecommendationItemDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[SkuBidRecommendationItemDTO] = deriveEncoder
}
