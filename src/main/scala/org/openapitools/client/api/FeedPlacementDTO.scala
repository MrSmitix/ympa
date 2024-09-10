package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedPlacementDTO._

case class FeedPlacementDTO (
  status: Option[FeedStatusType],
/* Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса. */
  totalOffersCount: Option[Integer])

object FeedPlacementDTO {
  import DateTimeCodecs._

  implicit val FeedPlacementDTOCodecJson: CodecJson[FeedPlacementDTO] = CodecJson.derive[FeedPlacementDTO]
  implicit val FeedPlacementDTODecoder: EntityDecoder[FeedPlacementDTO] = jsonOf[FeedPlacementDTO]
  implicit val FeedPlacementDTOEncoder: EntityEncoder[FeedPlacementDTO] = jsonEncoderOf[FeedPlacementDTO]
}
