package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteOffersFromArchiveResponse._

case class DeleteOffersFromArchiveResponse (
  status: Option[ApiResponseStatusType],
result: Option[DeleteOffersFromArchiveDTO])

object DeleteOffersFromArchiveResponse {
  import DateTimeCodecs._

  implicit val DeleteOffersFromArchiveResponseCodecJson: CodecJson[DeleteOffersFromArchiveResponse] = CodecJson.derive[DeleteOffersFromArchiveResponse]
  implicit val DeleteOffersFromArchiveResponseDecoder: EntityDecoder[DeleteOffersFromArchiveResponse] = jsonOf[DeleteOffersFromArchiveResponse]
  implicit val DeleteOffersFromArchiveResponseEncoder: EntityEncoder[DeleteOffersFromArchiveResponse] = jsonEncoderOf[DeleteOffersFromArchiveResponse]
}
