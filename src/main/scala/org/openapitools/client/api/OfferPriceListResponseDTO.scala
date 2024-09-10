package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferPriceListResponseDTO._

case class OfferPriceListResponseDTO (
  /* Страница списка. */
  offers: List[OfferPriceResponseDTO],
paging: Option[ScrollingPagerDTO],
/* Количество всех цен магазина, измененных через API. */
  total: Option[Integer])

object OfferPriceListResponseDTO {
  import DateTimeCodecs._

  implicit val OfferPriceListResponseDTOCodecJson: CodecJson[OfferPriceListResponseDTO] = CodecJson.derive[OfferPriceListResponseDTO]
  implicit val OfferPriceListResponseDTODecoder: EntityDecoder[OfferPriceListResponseDTO] = jsonOf[OfferPriceListResponseDTO]
  implicit val OfferPriceListResponseDTOEncoder: EntityEncoder[OfferPriceListResponseDTO] = jsonEncoderOf[OfferPriceListResponseDTO]
}
