package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import UpdateStockItemDTO._

case class UpdateStockItemDTO (
  /* Количество доступного товара.  */
  count: Long,
/* Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  */
  updatedAt: Option[OffsetDateTime])

object UpdateStockItemDTO {
  import DateTimeCodecs._

  implicit val UpdateStockItemDTOCodecJson: CodecJson[UpdateStockItemDTO] = CodecJson.derive[UpdateStockItemDTO]
  implicit val UpdateStockItemDTODecoder: EntityDecoder[UpdateStockItemDTO] = jsonOf[UpdateStockItemDTO]
  implicit val UpdateStockItemDTOEncoder: EntityEncoder[UpdateStockItemDTO] = jsonEncoderOf[UpdateStockItemDTO]
}
