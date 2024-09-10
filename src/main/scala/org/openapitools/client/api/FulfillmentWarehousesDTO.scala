package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FulfillmentWarehousesDTO._

case class FulfillmentWarehousesDTO (
  /* Список складов Маркета (FBY). */
  warehouses: List[FulfillmentWarehouseDTO])

object FulfillmentWarehousesDTO {
  import DateTimeCodecs._

  implicit val FulfillmentWarehousesDTOCodecJson: CodecJson[FulfillmentWarehousesDTO] = CodecJson.derive[FulfillmentWarehousesDTO]
  implicit val FulfillmentWarehousesDTODecoder: EntityDecoder[FulfillmentWarehousesDTO] = jsonOf[FulfillmentWarehousesDTO]
  implicit val FulfillmentWarehousesDTOEncoder: EntityEncoder[FulfillmentWarehousesDTO] = jsonEncoderOf[FulfillmentWarehousesDTO]
}
