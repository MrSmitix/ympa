package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetWarehouseStocksResponse._

case class GetWarehouseStocksResponse (
  status: Option[ApiResponseStatusType],
result: Option[GetWarehouseStocksDTO])

object GetWarehouseStocksResponse {
  import DateTimeCodecs._

  implicit val GetWarehouseStocksResponseCodecJson: CodecJson[GetWarehouseStocksResponse] = CodecJson.derive[GetWarehouseStocksResponse]
  implicit val GetWarehouseStocksResponseDecoder: EntityDecoder[GetWarehouseStocksResponse] = jsonOf[GetWarehouseStocksResponse]
  implicit val GetWarehouseStocksResponseEncoder: EntityEncoder[GetWarehouseStocksResponse] = jsonEncoderOf[GetWarehouseStocksResponse]
}
