package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedDownloadDTO._

case class FeedDownloadDTO (
  status: Option[FeedStatusType],
error: Option[FeedDownloadErrorDTO])

object FeedDownloadDTO {
  import DateTimeCodecs._

  implicit val FeedDownloadDTOCodecJson: CodecJson[FeedDownloadDTO] = CodecJson.derive[FeedDownloadDTO]
  implicit val FeedDownloadDTODecoder: EntityDecoder[FeedDownloadDTO] = jsonOf[FeedDownloadDTO]
  implicit val FeedDownloadDTOEncoder: EntityEncoder[FeedDownloadDTO] = jsonEncoderOf[FeedDownloadDTO]
}
