package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferPriceByOfferIdsListResponseDTO._

case class OfferPriceByOfferIdsListResponseDTO (
  /* Страница списка цен. */
  offers: List[OfferPriceByOfferIdsResponseDTO],
paging: Option[ScrollingPagerDTO])

object OfferPriceByOfferIdsListResponseDTO {
  import DateTimeCodecs._

  implicit val OfferPriceByOfferIdsListResponseDTOCodecJson: CodecJson[OfferPriceByOfferIdsListResponseDTO] = CodecJson.derive[OfferPriceByOfferIdsListResponseDTO]
  implicit val OfferPriceByOfferIdsListResponseDTODecoder: EntityDecoder[OfferPriceByOfferIdsListResponseDTO] = jsonOf[OfferPriceByOfferIdsListResponseDTO]
  implicit val OfferPriceByOfferIdsListResponseDTOEncoder: EntityEncoder[OfferPriceByOfferIdsListResponseDTO] = jsonEncoderOf[OfferPriceByOfferIdsListResponseDTO]
}
