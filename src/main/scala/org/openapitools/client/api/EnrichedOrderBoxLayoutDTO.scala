package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EnrichedOrderBoxLayoutDTO._

case class EnrichedOrderBoxLayoutDTO (
  /* Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  */
  items: List[OrderBoxLayoutItemDTO],
/* Идентификатор коробки. */
  boxId: Option[Long])

object EnrichedOrderBoxLayoutDTO {
  import DateTimeCodecs._

  implicit val EnrichedOrderBoxLayoutDTOCodecJson: CodecJson[EnrichedOrderBoxLayoutDTO] = CodecJson.derive[EnrichedOrderBoxLayoutDTO]
  implicit val EnrichedOrderBoxLayoutDTODecoder: EntityDecoder[EnrichedOrderBoxLayoutDTO] = jsonOf[EnrichedOrderBoxLayoutDTO]
  implicit val EnrichedOrderBoxLayoutDTOEncoder: EntityEncoder[EnrichedOrderBoxLayoutDTO] = jsonEncoderOf[EnrichedOrderBoxLayoutDTO]
}
