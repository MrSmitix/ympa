package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import WarehouseOfferDTO._

case class WarehouseOfferDTO (
  /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  offerId: String,
turnoverSummary: Option[TurnoverDTO],
/* Информация об остатках. */
  stocks: List[WarehouseStockDTO],
/* Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`.  */
  updatedAt: Option[OffsetDateTime])

object WarehouseOfferDTO {
  import DateTimeCodecs._

  implicit val WarehouseOfferDTOCodecJson: CodecJson[WarehouseOfferDTO] = CodecJson.derive[WarehouseOfferDTO]
  implicit val WarehouseOfferDTODecoder: EntityDecoder[WarehouseOfferDTO] = jsonOf[WarehouseOfferDTO]
  implicit val WarehouseOfferDTOEncoder: EntityEncoder[WarehouseOfferDTO] = jsonEncoderOf[WarehouseOfferDTO]
}
