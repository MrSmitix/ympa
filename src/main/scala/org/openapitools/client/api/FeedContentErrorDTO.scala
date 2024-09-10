package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedContentErrorDTO._

case class FeedContentErrorDTO (
  `type`: Option[FeedContentErrorType])

object FeedContentErrorDTO {
  import DateTimeCodecs._

  implicit val FeedContentErrorDTOCodecJson: CodecJson[FeedContentErrorDTO] = CodecJson.derive[FeedContentErrorDTO]
  implicit val FeedContentErrorDTODecoder: EntityDecoder[FeedContentErrorDTO] = jsonOf[FeedContentErrorDTO]
  implicit val FeedContentErrorDTOEncoder: EntityEncoder[FeedContentErrorDTO] = jsonEncoderOf[FeedContentErrorDTO]
}
