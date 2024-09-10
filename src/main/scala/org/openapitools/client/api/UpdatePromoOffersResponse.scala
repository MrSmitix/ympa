package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePromoOffersResponse._

case class UpdatePromoOffersResponse (
  status: Option[ApiResponseStatusType],
result: Option[UpdatePromoOffersResultDTO])

object UpdatePromoOffersResponse {
  import DateTimeCodecs._

  implicit val UpdatePromoOffersResponseCodecJson: CodecJson[UpdatePromoOffersResponse] = CodecJson.derive[UpdatePromoOffersResponse]
  implicit val UpdatePromoOffersResponseDecoder: EntityDecoder[UpdatePromoOffersResponse] = jsonOf[UpdatePromoOffersResponse]
  implicit val UpdatePromoOffersResponseEncoder: EntityEncoder[UpdatePromoOffersResponse] = jsonEncoderOf[UpdatePromoOffersResponse]
}
