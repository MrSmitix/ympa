package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SearchShipmentsResponse._

case class SearchShipmentsResponse (
  status: Option[ApiResponseStatusType],
result: Option[SearchShipmentsResponseDTO])

object SearchShipmentsResponse {
  import DateTimeCodecs._

  implicit val SearchShipmentsResponseCodecJson: CodecJson[SearchShipmentsResponse] = CodecJson.derive[SearchShipmentsResponse]
  implicit val SearchShipmentsResponseDecoder: EntityDecoder[SearchShipmentsResponse] = jsonOf[SearchShipmentsResponse]
  implicit val SearchShipmentsResponseEncoder: EntityEncoder[SearchShipmentsResponse] = jsonEncoderOf[SearchShipmentsResponse]
}
