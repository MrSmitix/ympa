package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedIndexLogsOffersDTO._

case class FeedIndexLogsOffersDTO (
  /* Количество предложений, который не опубликованы на Маркете из-за найденных ошибок. */
  rejectedCount: Option[Long],
/* Количество предложений в прайс-листе. */
  totalCount: Option[Long])

object FeedIndexLogsOffersDTO {
  import DateTimeCodecs._

  implicit val FeedIndexLogsOffersDTOCodecJson: CodecJson[FeedIndexLogsOffersDTO] = CodecJson.derive[FeedIndexLogsOffersDTO]
  implicit val FeedIndexLogsOffersDTODecoder: EntityDecoder[FeedIndexLogsOffersDTO] = jsonOf[FeedIndexLogsOffersDTO]
  implicit val FeedIndexLogsOffersDTOEncoder: EntityEncoder[FeedIndexLogsOffersDTO] = jsonEncoderOf[FeedIndexLogsOffersDTO]
}
