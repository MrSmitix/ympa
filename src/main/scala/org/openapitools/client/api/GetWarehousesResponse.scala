package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetWarehousesResponse._

case class GetWarehousesResponse (
  status: Option[ApiResponseStatusType],
result: Option[WarehousesDTO])

object GetWarehousesResponse {
  import DateTimeCodecs._

  implicit val GetWarehousesResponseCodecJson: CodecJson[GetWarehousesResponse] = CodecJson.derive[GetWarehousesResponse]
  implicit val GetWarehousesResponseDecoder: EntityDecoder[GetWarehousesResponse] = jsonOf[GetWarehousesResponse]
  implicit val GetWarehousesResponseEncoder: EntityEncoder[GetWarehousesResponse] = jsonEncoderOf[GetWarehousesResponse]
}
