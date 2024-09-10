package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedPublicationDTO._

case class FeedPublicationDTO (
  status: Option[FeedStatusType],
full: Option[FeedPublicationFullDTO],
priceAndStockUpdate: Option[FeedPublicationPriceAndStockUpdateDTO])

object FeedPublicationDTO {
  import DateTimeCodecs._

  implicit val FeedPublicationDTOCodecJson: CodecJson[FeedPublicationDTO] = CodecJson.derive[FeedPublicationDTO]
  implicit val FeedPublicationDTODecoder: EntityDecoder[FeedPublicationDTO] = jsonOf[FeedPublicationDTO]
  implicit val FeedPublicationDTOEncoder: EntityEncoder[FeedPublicationDTO] = jsonEncoderOf[FeedPublicationDTO]
}
