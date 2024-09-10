package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetShipmentOrdersInfoResponse._

case class GetShipmentOrdersInfoResponse (
  status: Option[ApiResponseStatusType],
result: Option[OrdersShipmentInfoDTO])

object GetShipmentOrdersInfoResponse {
  import DateTimeCodecs._

  implicit val GetShipmentOrdersInfoResponseCodecJson: CodecJson[GetShipmentOrdersInfoResponse] = CodecJson.derive[GetShipmentOrdersInfoResponse]
  implicit val GetShipmentOrdersInfoResponseDecoder: EntityDecoder[GetShipmentOrdersInfoResponse] = jsonOf[GetShipmentOrdersInfoResponse]
  implicit val GetShipmentOrdersInfoResponseEncoder: EntityEncoder[GetShipmentOrdersInfoResponse] = jsonEncoderOf[GetShipmentOrdersInfoResponse]
}
