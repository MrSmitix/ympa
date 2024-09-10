package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import WarehouseOffersDTO._

case class WarehouseOffersDTO (
  /* Идентификатор склада. */
  warehouseId: Long,
/* Информация об остатках. */
  offers: List[WarehouseOfferDTO])

object WarehouseOffersDTO {
  import DateTimeCodecs._

  implicit val WarehouseOffersDTOCodecJson: CodecJson[WarehouseOffersDTO] = CodecJson.derive[WarehouseOffersDTO]
  implicit val WarehouseOffersDTODecoder: EntityDecoder[WarehouseOffersDTO] = jsonOf[WarehouseOffersDTO]
  implicit val WarehouseOffersDTOEncoder: EntityEncoder[WarehouseOffersDTO] = jsonEncoderOf[WarehouseOffersDTO]
}
