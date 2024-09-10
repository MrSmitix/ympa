package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BriefOrderItemDTO._

case class BriefOrderItemDTO (
  /* Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  */
  id: Option[Long],
vat: Option[OrderVatType],
/* Количество единиц товара. */
  count: Option[Integer],
/* Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  */
  price: Option[BigDecimal],
/* Название товара. */
  offerName: Option[String],
/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  offerId: Option[String],
/* Переданные вами коды маркировки. */
  instances: Option[List[OrderItemInstanceDTO]])

object BriefOrderItemDTO {
  import DateTimeCodecs._

  implicit val BriefOrderItemDTOCodecJson: CodecJson[BriefOrderItemDTO] = CodecJson.derive[BriefOrderItemDTO]
  implicit val BriefOrderItemDTODecoder: EntityDecoder[BriefOrderItemDTO] = jsonOf[BriefOrderItemDTO]
  implicit val BriefOrderItemDTOEncoder: EntityEncoder[BriefOrderItemDTO] = jsonEncoderOf[BriefOrderItemDTO]
}
