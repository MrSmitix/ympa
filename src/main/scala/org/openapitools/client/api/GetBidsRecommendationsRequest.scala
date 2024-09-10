package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBidsRecommendationsRequest._

case class GetBidsRecommendationsRequest (
  /* Список товаров, для которых нужно получить рекомендации по ставкам.  */
  skus: List[String])

object GetBidsRecommendationsRequest {
  import DateTimeCodecs._

  implicit val GetBidsRecommendationsRequestCodecJson: CodecJson[GetBidsRecommendationsRequest] = CodecJson.derive[GetBidsRecommendationsRequest]
  implicit val GetBidsRecommendationsRequestDecoder: EntityDecoder[GetBidsRecommendationsRequest] = jsonOf[GetBidsRecommendationsRequest]
  implicit val GetBidsRecommendationsRequestEncoder: EntityEncoder[GetBidsRecommendationsRequest] = jsonEncoderOf[GetBidsRecommendationsRequest]
}
