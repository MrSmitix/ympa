package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedIndexLogsErrorDTO._

case class FeedIndexLogsErrorDTO (
  /* HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  */
  httpStatusCode: Option[Integer],
`type`: Option[FeedIndexLogsErrorType],
/* Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`.  */
  description: Option[String])

object FeedIndexLogsErrorDTO {
  import DateTimeCodecs._

  implicit val FeedIndexLogsErrorDTOCodecJson: CodecJson[FeedIndexLogsErrorDTO] = CodecJson.derive[FeedIndexLogsErrorDTO]
  implicit val FeedIndexLogsErrorDTODecoder: EntityDecoder[FeedIndexLogsErrorDTO] = jsonOf[FeedIndexLogsErrorDTO]
  implicit val FeedIndexLogsErrorDTOEncoder: EntityEncoder[FeedIndexLogsErrorDTO] = jsonEncoderOf[FeedIndexLogsErrorDTO]
}
