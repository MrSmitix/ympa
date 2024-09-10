package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeletePromoOffersResponse._

case class DeletePromoOffersResponse (
  status: Option[ApiResponseStatusType],
result: Option[DeletePromoOffersResultDTO])

object DeletePromoOffersResponse {
  import DateTimeCodecs._

  implicit val DeletePromoOffersResponseCodecJson: CodecJson[DeletePromoOffersResponse] = CodecJson.derive[DeletePromoOffersResponse]
  implicit val DeletePromoOffersResponseDecoder: EntityDecoder[DeletePromoOffersResponse] = jsonOf[DeletePromoOffersResponse]
  implicit val DeletePromoOffersResponseEncoder: EntityEncoder[DeletePromoOffersResponse] = jsonEncoderOf[DeletePromoOffersResponse]
}
