package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteOffersResponse._

case class DeleteOffersResponse (
  status: Option[ApiResponseStatusType],
result: Option[DeleteOffersDTO])

object DeleteOffersResponse {
  import DateTimeCodecs._

  implicit val DeleteOffersResponseCodecJson: CodecJson[DeleteOffersResponse] = CodecJson.derive[DeleteOffersResponse]
  implicit val DeleteOffersResponseDecoder: EntityDecoder[DeleteOffersResponse] = jsonOf[DeleteOffersResponse]
  implicit val DeleteOffersResponseEncoder: EntityEncoder[DeleteOffersResponse] = jsonEncoderOf[DeleteOffersResponse]
}
