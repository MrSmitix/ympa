package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOfferRecommendationsRequest._

case class GetOfferRecommendationsRequest (
  /* Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. */
  offerIds: Option[List[String]],
cofinancePriceFilter: Option[FieldStateType],
recommendedCofinancePriceFilter: Option[FieldStateType],
competitivenessFilter: Option[PriceCompetitivenessType])

object GetOfferRecommendationsRequest {
  import DateTimeCodecs._

  implicit val GetOfferRecommendationsRequestCodecJson: CodecJson[GetOfferRecommendationsRequest] = CodecJson.derive[GetOfferRecommendationsRequest]
  implicit val GetOfferRecommendationsRequestDecoder: EntityDecoder[GetOfferRecommendationsRequest] = jsonOf[GetOfferRecommendationsRequest]
  implicit val GetOfferRecommendationsRequestEncoder: EntityEncoder[GetOfferRecommendationsRequest] = jsonEncoderOf[GetOfferRecommendationsRequest]
}
