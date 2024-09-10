package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOrderBuyerInfoResponse._

case class GetOrderBuyerInfoResponse (
  status: Option[ApiResponseStatusType],
result: Option[OrderBuyerInfoDTO])

object GetOrderBuyerInfoResponse {
  import DateTimeCodecs._

  implicit val GetOrderBuyerInfoResponseCodecJson: CodecJson[GetOrderBuyerInfoResponse] = CodecJson.derive[GetOrderBuyerInfoResponse]
  implicit val GetOrderBuyerInfoResponseDecoder: EntityDecoder[GetOrderBuyerInfoResponse] = jsonOf[GetOrderBuyerInfoResponse]
  implicit val GetOrderBuyerInfoResponseEncoder: EntityEncoder[GetOrderBuyerInfoResponse] = jsonEncoderOf[GetOrderBuyerInfoResponse]
}
