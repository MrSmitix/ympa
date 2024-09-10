package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SetOrderBoxLayoutResponse._

case class SetOrderBoxLayoutResponse (
  status: Option[ApiResponseStatusType],
result: Option[OrderBoxesLayoutDTO])

object SetOrderBoxLayoutResponse {
  import DateTimeCodecs._

  implicit val SetOrderBoxLayoutResponseCodecJson: CodecJson[SetOrderBoxLayoutResponse] = CodecJson.derive[SetOrderBoxLayoutResponse]
  implicit val SetOrderBoxLayoutResponseDecoder: EntityDecoder[SetOrderBoxLayoutResponse] = jsonOf[SetOrderBoxLayoutResponse]
  implicit val SetOrderBoxLayoutResponseEncoder: EntityEncoder[SetOrderBoxLayoutResponse] = jsonEncoderOf[SetOrderBoxLayoutResponse]
}
