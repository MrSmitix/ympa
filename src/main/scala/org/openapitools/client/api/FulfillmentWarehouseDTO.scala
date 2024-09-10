package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FulfillmentWarehouseDTO._

case class FulfillmentWarehouseDTO (
  /* Идентификатор склада. */
  id: Long,
/* Название склада. */
  name: String,
address: Option[WarehouseAddressDTO])

object FulfillmentWarehouseDTO {
  import DateTimeCodecs._

  implicit val FulfillmentWarehouseDTOCodecJson: CodecJson[FulfillmentWarehouseDTO] = CodecJson.derive[FulfillmentWarehouseDTO]
  implicit val FulfillmentWarehouseDTODecoder: EntityDecoder[FulfillmentWarehouseDTO] = jsonOf[FulfillmentWarehouseDTO]
  implicit val FulfillmentWarehouseDTOEncoder: EntityEncoder[FulfillmentWarehouseDTO] = jsonEncoderOf[FulfillmentWarehouseDTO]
}
