package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetQuarantineOffersResultDTO._

case class GetQuarantineOffersResultDTO (
  paging: Option[ScrollingPagerDTO],
/* Страница списка товаров в карантине. */
  offers: List[QuarantineOfferDTO])

object GetQuarantineOffersResultDTO {
  import DateTimeCodecs._

  implicit val GetQuarantineOffersResultDTOCodecJson: CodecJson[GetQuarantineOffersResultDTO] = CodecJson.derive[GetQuarantineOffersResultDTO]
  implicit val GetQuarantineOffersResultDTODecoder: EntityDecoder[GetQuarantineOffersResultDTO] = jsonOf[GetQuarantineOffersResultDTO]
  implicit val GetQuarantineOffersResultDTOEncoder: EntityEncoder[GetQuarantineOffersResultDTO] = jsonEncoderOf[GetQuarantineOffersResultDTO]
}
