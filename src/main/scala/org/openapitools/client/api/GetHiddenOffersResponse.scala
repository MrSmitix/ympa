package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetHiddenOffersResponse._

case class GetHiddenOffersResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetHiddenOffersResultDTO])

object GetHiddenOffersResponse {
  import DateTimeCodecs._

  implicit val GetHiddenOffersResponseCodecJson: CodecJson[GetHiddenOffersResponse] = CodecJson.derive[GetHiddenOffersResponse]
  implicit val GetHiddenOffersResponseDecoder: EntityDecoder[GetHiddenOffersResponse] = jsonOf[GetHiddenOffersResponse]
  implicit val GetHiddenOffersResponseEncoder: EntityEncoder[GetHiddenOffersResponse] = jsonEncoderOf[GetHiddenOffersResponse]
}
