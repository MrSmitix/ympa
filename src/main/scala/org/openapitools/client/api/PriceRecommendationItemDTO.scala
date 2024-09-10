package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PriceRecommendationItemDTO._

case class PriceRecommendationItemDTO (
  /* Идентификатор кампании. */
  campaignId: Long,
/* Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)  */
  price: BigDecimal)

object PriceRecommendationItemDTO {
  import DateTimeCodecs._

  implicit val PriceRecommendationItemDTOCodecJson: CodecJson[PriceRecommendationItemDTO] = CodecJson.derive[PriceRecommendationItemDTO]
  implicit val PriceRecommendationItemDTODecoder: EntityDecoder[PriceRecommendationItemDTO] = jsonOf[PriceRecommendationItemDTO]
  implicit val PriceRecommendationItemDTOEncoder: EntityEncoder[PriceRecommendationItemDTO] = jsonEncoderOf[PriceRecommendationItemDTO]
}
