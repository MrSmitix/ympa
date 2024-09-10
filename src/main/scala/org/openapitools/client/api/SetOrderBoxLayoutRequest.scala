package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SetOrderBoxLayoutRequest._

case class SetOrderBoxLayoutRequest (
  /* Список коробок. */
  boxes: List[OrderBoxLayoutDTO],
/* Передайте `true`, если вы собираетесь удалить часть товаров из заказа. */
  allowRemove: Option[Boolean])

object SetOrderBoxLayoutRequest {
  import DateTimeCodecs._

  implicit val SetOrderBoxLayoutRequestCodecJson: CodecJson[SetOrderBoxLayoutRequest] = CodecJson.derive[SetOrderBoxLayoutRequest]
  implicit val SetOrderBoxLayoutRequestDecoder: EntityDecoder[SetOrderBoxLayoutRequest] = jsonOf[SetOrderBoxLayoutRequest]
  implicit val SetOrderBoxLayoutRequestEncoder: EntityEncoder[SetOrderBoxLayoutRequest] = jsonEncoderOf[SetOrderBoxLayoutRequest]
}
