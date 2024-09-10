package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReturnItemDTO._

case class ReturnItemDTO (
  /* SKU на Маркете. */
  marketSku: Option[Long],
/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  shopSku: String,
/* Количество единиц товара. */
  count: Long,
/* Список решений по возврату. */
  decisions: Option[List[ReturnDecisionDTO]],
/* Список логистических позиций возврата. */
  instances: Option[List[ReturnInstanceDTO]],
/* Список трек-кодов для почтовых отправлений. */
  tracks: Option[List[TrackDTO]])

object ReturnItemDTO {
  import DateTimeCodecs._

  implicit val ReturnItemDTOCodecJson: CodecJson[ReturnItemDTO] = CodecJson.derive[ReturnItemDTO]
  implicit val ReturnItemDTODecoder: EntityDecoder[ReturnItemDTO] = jsonOf[ReturnItemDTO]
  implicit val ReturnItemDTOEncoder: EntityEncoder[ReturnItemDTO] = jsonEncoderOf[ReturnItemDTO]
}
