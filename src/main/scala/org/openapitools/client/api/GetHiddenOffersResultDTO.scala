package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetHiddenOffersResultDTO._

case class GetHiddenOffersResultDTO (
  paging: Option[ScrollingPagerDTO],
/* Список скрытых товаров. */
  hiddenOffers: List[HiddenOfferDTO])

object GetHiddenOffersResultDTO {
  import DateTimeCodecs._

  implicit val GetHiddenOffersResultDTOCodecJson: CodecJson[GetHiddenOffersResultDTO] = CodecJson.derive[GetHiddenOffersResultDTO]
  implicit val GetHiddenOffersResultDTODecoder: EntityDecoder[GetHiddenOffersResultDTO] = jsonOf[GetHiddenOffersResultDTO]
  implicit val GetHiddenOffersResultDTOEncoder: EntityEncoder[GetHiddenOffersResultDTO] = jsonEncoderOf[GetHiddenOffersResultDTO]
}
