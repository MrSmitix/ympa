package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBusinessBuyerInfoResponse._

case class GetBusinessBuyerInfoResponse (
  status: Option[ApiResponseStatusType],
result: Option[OrderBusinessBuyerDTO])

object GetBusinessBuyerInfoResponse {
  import DateTimeCodecs._

  implicit val GetBusinessBuyerInfoResponseCodecJson: CodecJson[GetBusinessBuyerInfoResponse] = CodecJson.derive[GetBusinessBuyerInfoResponse]
  implicit val GetBusinessBuyerInfoResponseDecoder: EntityDecoder[GetBusinessBuyerInfoResponse] = jsonOf[GetBusinessBuyerInfoResponse]
  implicit val GetBusinessBuyerInfoResponseEncoder: EntityEncoder[GetBusinessBuyerInfoResponse] = jsonEncoderOf[GetBusinessBuyerInfoResponse]
}
