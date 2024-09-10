package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedContentDTO._

case class FeedContentDTO (
  /* Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`.  */
  rejectedOffersCount: Option[Long],
status: Option[FeedStatusType],
/* Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`.  */
  totalOffersCount: Option[Long],
error: Option[FeedContentErrorDTO])

object FeedContentDTO {
  import DateTimeCodecs._

  implicit val FeedContentDTOCodecJson: CodecJson[FeedContentDTO] = CodecJson.derive[FeedContentDTO]
  implicit val FeedContentDTODecoder: EntityDecoder[FeedContentDTO] = jsonOf[FeedContentDTO]
  implicit val FeedContentDTOEncoder: EntityEncoder[FeedContentDTO] = jsonEncoderOf[FeedContentDTO]
}
