package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateOutletResponse._

case class CreateOutletResponse (
  status: Option[ApiResponseStatusType],
result: Option[OutletResponseDTO])

object CreateOutletResponse {
  import DateTimeCodecs._

  implicit val CreateOutletResponseCodecJson: CodecJson[CreateOutletResponse] = CodecJson.derive[CreateOutletResponse]
  implicit val CreateOutletResponseDecoder: EntityDecoder[CreateOutletResponse] = jsonOf[CreateOutletResponse]
  implicit val CreateOutletResponseEncoder: EntityEncoder[CreateOutletResponse] = jsonEncoderOf[CreateOutletResponse]
}
