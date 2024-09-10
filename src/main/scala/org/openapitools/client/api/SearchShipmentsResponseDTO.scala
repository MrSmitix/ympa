package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SearchShipmentsResponseDTO._

case class SearchShipmentsResponseDTO (
  /* Список с информацией об отгрузках. */
  shipments: List[ShipmentInfoDTO],
paging: Option[ForwardScrollingPagerDTO])

object SearchShipmentsResponseDTO {
  import DateTimeCodecs._

  implicit val SearchShipmentsResponseDTOCodecJson: CodecJson[SearchShipmentsResponseDTO] = CodecJson.derive[SearchShipmentsResponseDTO]
  implicit val SearchShipmentsResponseDTODecoder: EntityDecoder[SearchShipmentsResponseDTO] = jsonOf[SearchShipmentsResponseDTO]
  implicit val SearchShipmentsResponseDTOEncoder: EntityEncoder[SearchShipmentsResponseDTO] = jsonEncoderOf[SearchShipmentsResponseDTO]
}
