package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeletePromoOffersResultDTO._

case class DeletePromoOffersResultDTO (
  /* Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  */
  rejectedOffers: Option[List[RejectedPromoOfferDeleteDTO]])

object DeletePromoOffersResultDTO {
  import DateTimeCodecs._

  implicit val DeletePromoOffersResultDTOCodecJson: CodecJson[DeletePromoOffersResultDTO] = CodecJson.derive[DeletePromoOffersResultDTO]
  implicit val DeletePromoOffersResultDTODecoder: EntityDecoder[DeletePromoOffersResultDTO] = jsonOf[DeletePromoOffersResultDTO]
  implicit val DeletePromoOffersResultDTOEncoder: EntityEncoder[DeletePromoOffersResultDTO] = jsonEncoderOf[DeletePromoOffersResultDTO]
}
