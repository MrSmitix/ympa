package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOrderLabelsDataResponse._

case class GetOrderLabelsDataResponse (
  status: Option[ApiResponseStatusType],
result: Option[OrderLabelDTO])

object GetOrderLabelsDataResponse {
  import DateTimeCodecs._

  implicit val GetOrderLabelsDataResponseCodecJson: CodecJson[GetOrderLabelsDataResponse] = CodecJson.derive[GetOrderLabelsDataResponse]
  implicit val GetOrderLabelsDataResponseDecoder: EntityDecoder[GetOrderLabelsDataResponse] = jsonOf[GetOrderLabelsDataResponse]
  implicit val GetOrderLabelsDataResponseEncoder: EntityEncoder[GetOrderLabelsDataResponse] = jsonEncoderOf[GetOrderLabelsDataResponse]
}
