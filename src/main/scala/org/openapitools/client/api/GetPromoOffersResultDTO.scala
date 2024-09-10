package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPromoOffersResultDTO._

case class GetPromoOffersResultDTO (
  /* Товары, которые участвуют или могут участвовать в акции. */
  offers: List[GetPromoOfferDTO],
paging: Option[ForwardScrollingPagerDTO])

object GetPromoOffersResultDTO {
  import DateTimeCodecs._

  implicit val GetPromoOffersResultDTOCodecJson: CodecJson[GetPromoOffersResultDTO] = CodecJson.derive[GetPromoOffersResultDTO]
  implicit val GetPromoOffersResultDTODecoder: EntityDecoder[GetPromoOffersResultDTO] = jsonOf[GetPromoOffersResultDTO]
  implicit val GetPromoOffersResultDTOEncoder: EntityEncoder[GetPromoOffersResultDTO] = jsonEncoderOf[GetPromoOffersResultDTO]
}
