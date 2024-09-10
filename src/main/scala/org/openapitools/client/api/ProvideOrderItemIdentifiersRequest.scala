package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProvideOrderItemIdentifiersRequest._

case class ProvideOrderItemIdentifiersRequest (
  /* Список позиций, требующих маркировки.  */
  items: List[OrderItemInstanceModificationDTO])

object ProvideOrderItemIdentifiersRequest {
  import DateTimeCodecs._

  implicit val ProvideOrderItemIdentifiersRequestCodecJson: CodecJson[ProvideOrderItemIdentifiersRequest] = CodecJson.derive[ProvideOrderItemIdentifiersRequest]
  implicit val ProvideOrderItemIdentifiersRequestDecoder: EntityDecoder[ProvideOrderItemIdentifiersRequest] = jsonOf[ProvideOrderItemIdentifiersRequest]
  implicit val ProvideOrderItemIdentifiersRequestEncoder: EntityEncoder[ProvideOrderItemIdentifiersRequest] = jsonEncoderOf[ProvideOrderItemIdentifiersRequest]
}
