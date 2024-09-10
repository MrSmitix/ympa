package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedDownloadErrorDTO._

case class FeedDownloadErrorDTO (
  /* HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  */
  httpStatusCode: Option[Integer],
`type`: Option[FeedDownloadErrorType],
/* Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`.  */
  description: Option[String])

object FeedDownloadErrorDTO {
  import DateTimeCodecs._

  implicit val FeedDownloadErrorDTOCodecJson: CodecJson[FeedDownloadErrorDTO] = CodecJson.derive[FeedDownloadErrorDTO]
  implicit val FeedDownloadErrorDTODecoder: EntityDecoder[FeedDownloadErrorDTO] = jsonOf[FeedDownloadErrorDTO]
  implicit val FeedDownloadErrorDTOEncoder: EntityEncoder[FeedDownloadErrorDTO] = jsonEncoderOf[FeedDownloadErrorDTO]
}
