package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBidsInfoResponseDTO._

case class GetBidsInfoResponseDTO (
  /* Страница списка товаров. */
  bids: List[SkuBidItemDTO],
paging: Option[ForwardScrollingPagerDTO])

object GetBidsInfoResponseDTO {
  import DateTimeCodecs._

  implicit val GetBidsInfoResponseDTOCodecJson: CodecJson[GetBidsInfoResponseDTO] = CodecJson.derive[GetBidsInfoResponseDTO]
  implicit val GetBidsInfoResponseDTODecoder: EntityDecoder[GetBidsInfoResponseDTO] = jsonOf[GetBidsInfoResponseDTO]
  implicit val GetBidsInfoResponseDTOEncoder: EntityEncoder[GetBidsInfoResponseDTO] = jsonEncoderOf[GetBidsInfoResponseDTO]
}
