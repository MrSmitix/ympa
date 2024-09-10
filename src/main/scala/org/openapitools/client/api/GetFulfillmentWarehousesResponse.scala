package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetFulfillmentWarehousesResponse._

case class GetFulfillmentWarehousesResponse (
  status: Option[ApiResponseStatusType],
result: Option[FulfillmentWarehousesDTO])

object GetFulfillmentWarehousesResponse {
  import DateTimeCodecs._

  implicit val GetFulfillmentWarehousesResponseCodecJson: CodecJson[GetFulfillmentWarehousesResponse] = CodecJson.derive[GetFulfillmentWarehousesResponse]
  implicit val GetFulfillmentWarehousesResponseDecoder: EntityDecoder[GetFulfillmentWarehousesResponse] = jsonOf[GetFulfillmentWarehousesResponse]
  implicit val GetFulfillmentWarehousesResponseEncoder: EntityEncoder[GetFulfillmentWarehousesResponse] = jsonEncoderOf[GetFulfillmentWarehousesResponse]
}
