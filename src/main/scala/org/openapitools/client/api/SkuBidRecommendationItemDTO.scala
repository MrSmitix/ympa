package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SkuBidRecommendationItemDTO._

case class SkuBidRecommendationItemDTO (
  /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  sku: String,
/* Значение ставки. */
  bid: Integer,
/* Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.  */
  bidRecommendations: Option[List[BidRecommendationItemDTO]],
/* Рекомендованные цены. */
  priceRecommendations: Option[List[PriceRecommendationItemDTO]])

object SkuBidRecommendationItemDTO {
  import DateTimeCodecs._

  implicit val SkuBidRecommendationItemDTOCodecJson: CodecJson[SkuBidRecommendationItemDTO] = CodecJson.derive[SkuBidRecommendationItemDTO]
  implicit val SkuBidRecommendationItemDTODecoder: EntityDecoder[SkuBidRecommendationItemDTO] = jsonOf[SkuBidRecommendationItemDTO]
  implicit val SkuBidRecommendationItemDTOEncoder: EntityEncoder[SkuBidRecommendationItemDTO] = jsonEncoderOf[SkuBidRecommendationItemDTO]
}
