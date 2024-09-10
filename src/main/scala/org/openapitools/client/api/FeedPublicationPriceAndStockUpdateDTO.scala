package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import FeedPublicationPriceAndStockUpdateDTO._

case class FeedPublicationPriceAndStockUpdateDTO (
  /* Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
  fileTime: Option[OffsetDateTime],
/* Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
  publishedTime: Option[OffsetDateTime])

object FeedPublicationPriceAndStockUpdateDTO {
  import DateTimeCodecs._

  implicit val FeedPublicationPriceAndStockUpdateDTOCodecJson: CodecJson[FeedPublicationPriceAndStockUpdateDTO] = CodecJson.derive[FeedPublicationPriceAndStockUpdateDTO]
  implicit val FeedPublicationPriceAndStockUpdateDTODecoder: EntityDecoder[FeedPublicationPriceAndStockUpdateDTO] = jsonOf[FeedPublicationPriceAndStockUpdateDTO]
  implicit val FeedPublicationPriceAndStockUpdateDTOEncoder: EntityEncoder[FeedPublicationPriceAndStockUpdateDTO] = jsonEncoderOf[FeedPublicationPriceAndStockUpdateDTO]
}
