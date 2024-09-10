package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOrderItemRequest._

case class UpdateOrderItemRequest (
  /* Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  */
  items: List[OrderItemModificationDTO],
reason: Option[OrderItemsModificationRequestReasonType])

object UpdateOrderItemRequest {
  import DateTimeCodecs._

  implicit val UpdateOrderItemRequestCodecJson: CodecJson[UpdateOrderItemRequest] = CodecJson.derive[UpdateOrderItemRequest]
  implicit val UpdateOrderItemRequestDecoder: EntityDecoder[UpdateOrderItemRequest] = jsonOf[UpdateOrderItemRequest]
  implicit val UpdateOrderItemRequestEncoder: EntityEncoder[UpdateOrderItemRequest] = jsonEncoderOf[UpdateOrderItemRequest]
}
