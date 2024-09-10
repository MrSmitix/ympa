package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPromoOffersResponse._

case class GetPromoOffersResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetPromoOffersResultDTO])

object GetPromoOffersResponse {
  import DateTimeCodecs._

  implicit val GetPromoOffersResponseCodecJson: CodecJson[GetPromoOffersResponse] = CodecJson.derive[GetPromoOffersResponse]
  implicit val GetPromoOffersResponseDecoder: EntityDecoder[GetPromoOffersResponse] = jsonOf[GetPromoOffersResponse]
  implicit val GetPromoOffersResponseEncoder: EntityEncoder[GetPromoOffersResponse] = jsonEncoderOf[GetPromoOffersResponse]
}
