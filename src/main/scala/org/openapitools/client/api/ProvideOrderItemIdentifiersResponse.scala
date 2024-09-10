package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProvideOrderItemIdentifiersResponse._

case class ProvideOrderItemIdentifiersResponse (
  status: Option[ApiResponseStatusType],
result: Option[OrderItemsModificationResultDTO])

object ProvideOrderItemIdentifiersResponse {
  import DateTimeCodecs._

  implicit val ProvideOrderItemIdentifiersResponseCodecJson: CodecJson[ProvideOrderItemIdentifiersResponse] = CodecJson.derive[ProvideOrderItemIdentifiersResponse]
  implicit val ProvideOrderItemIdentifiersResponseDecoder: EntityDecoder[ProvideOrderItemIdentifiersResponse] = jsonOf[ProvideOrderItemIdentifiersResponse]
  implicit val ProvideOrderItemIdentifiersResponseEncoder: EntityEncoder[ProvideOrderItemIdentifiersResponse] = jsonEncoderOf[ProvideOrderItemIdentifiersResponse]
}
