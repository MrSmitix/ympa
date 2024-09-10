package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderBoxLayoutDTO._

case class OrderBoxLayoutDTO (
  /* Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  */
  items: List[OrderBoxLayoutItemDTO])

object OrderBoxLayoutDTO {
  import DateTimeCodecs._

  implicit val OrderBoxLayoutDTOCodecJson: CodecJson[OrderBoxLayoutDTO] = CodecJson.derive[OrderBoxLayoutDTO]
  implicit val OrderBoxLayoutDTODecoder: EntityDecoder[OrderBoxLayoutDTO] = jsonOf[OrderBoxLayoutDTO]
  implicit val OrderBoxLayoutDTOEncoder: EntityEncoder[OrderBoxLayoutDTO] = jsonEncoderOf[OrderBoxLayoutDTO]
}
