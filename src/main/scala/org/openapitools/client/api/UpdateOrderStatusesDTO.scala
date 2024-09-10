package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOrderStatusesDTO._

case class UpdateOrderStatusesDTO (
  /* Список с обновленными заказами. */
  orders: List[UpdateOrderStatusDTO])

object UpdateOrderStatusesDTO {
  import DateTimeCodecs._

  implicit val UpdateOrderStatusesDTOCodecJson: CodecJson[UpdateOrderStatusesDTO] = CodecJson.derive[UpdateOrderStatusesDTO]
  implicit val UpdateOrderStatusesDTODecoder: EntityDecoder[UpdateOrderStatusesDTO] = jsonOf[UpdateOrderStatusesDTO]
  implicit val UpdateOrderStatusesDTOEncoder: EntityEncoder[UpdateOrderStatusesDTO] = jsonEncoderOf[UpdateOrderStatusesDTO]
}
