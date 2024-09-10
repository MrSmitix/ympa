package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedIndexLogsFeedDTO._

case class FeedIndexLogsFeedDTO (
  /* Идентификатор прайс-листа. */
  id: Option[Long])

object FeedIndexLogsFeedDTO {
  import DateTimeCodecs._

  implicit val FeedIndexLogsFeedDTOCodecJson: CodecJson[FeedIndexLogsFeedDTO] = CodecJson.derive[FeedIndexLogsFeedDTO]
  implicit val FeedIndexLogsFeedDTODecoder: EntityDecoder[FeedIndexLogsFeedDTO] = jsonOf[FeedIndexLogsFeedDTO]
  implicit val FeedIndexLogsFeedDTOEncoder: EntityEncoder[FeedIndexLogsFeedDTO] = jsonEncoderOf[FeedIndexLogsFeedDTO]
}
