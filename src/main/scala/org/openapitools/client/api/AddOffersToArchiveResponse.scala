package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AddOffersToArchiveResponse._

case class AddOffersToArchiveResponse (
  status: Option[ApiResponseStatusType],
result: Option[AddOffersToArchiveDTO])

object AddOffersToArchiveResponse {
  import DateTimeCodecs._

  implicit val AddOffersToArchiveResponseCodecJson: CodecJson[AddOffersToArchiveResponse] = CodecJson.derive[AddOffersToArchiveResponse]
  implicit val AddOffersToArchiveResponseDecoder: EntityDecoder[AddOffersToArchiveResponse] = jsonOf[AddOffersToArchiveResponse]
  implicit val AddOffersToArchiveResponseEncoder: EntityEncoder[AddOffersToArchiveResponse] = jsonEncoderOf[AddOffersToArchiveResponse]
}
