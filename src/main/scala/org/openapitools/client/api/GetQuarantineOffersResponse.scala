package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetQuarantineOffersResponse._

case class GetQuarantineOffersResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetQuarantineOffersResultDTO])

object GetQuarantineOffersResponse {
  import DateTimeCodecs._

  implicit val GetQuarantineOffersResponseCodecJson: CodecJson[GetQuarantineOffersResponse] = CodecJson.derive[GetQuarantineOffersResponse]
  implicit val GetQuarantineOffersResponseDecoder: EntityDecoder[GetQuarantineOffersResponse] = jsonOf[GetQuarantineOffersResponse]
  implicit val GetQuarantineOffersResponseEncoder: EntityEncoder[GetQuarantineOffersResponse] = jsonEncoderOf[GetQuarantineOffersResponse]
}
