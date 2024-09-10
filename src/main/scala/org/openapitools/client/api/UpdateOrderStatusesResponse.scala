package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOrderStatusesResponse._

case class UpdateOrderStatusesResponse (
  status: Option[ApiResponseStatusType],
result: Option[UpdateOrderStatusesDTO])

object UpdateOrderStatusesResponse {
  import DateTimeCodecs._

  implicit val UpdateOrderStatusesResponseCodecJson: CodecJson[UpdateOrderStatusesResponse] = CodecJson.derive[UpdateOrderStatusesResponse]
  implicit val UpdateOrderStatusesResponseDecoder: EntityDecoder[UpdateOrderStatusesResponse] = jsonOf[UpdateOrderStatusesResponse]
  implicit val UpdateOrderStatusesResponseEncoder: EntityEncoder[UpdateOrderStatusesResponse] = jsonEncoderOf[UpdateOrderStatusesResponse]
}
