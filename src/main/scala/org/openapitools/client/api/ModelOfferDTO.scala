package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModelOfferDTO._

case class ModelOfferDTO (
  /* Скидка на предложение в процентах. */
  discount: Option[Integer],
/* Наименование предложения. */
  name: Option[String],
/* Позиция предложения в выдаче Маркета на карточке модели. */
  pos: Option[Integer],
/* Цена предложения без скидки магазина. */
  preDiscountPrice: Option[BigDecimal],
/* Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. */
  price: Option[BigDecimal],
/* Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них.  */
  regionId: Option[Long],
/* Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  */
  shippingCost: Option[BigDecimal],
/* Название магазина (в том виде, в котором отображается на Маркете). */
  shopName: Option[String],
/* Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`.  */
  shopRating: Option[Integer],
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
  inStock: Option[Integer])

object ModelOfferDTO {
  import DateTimeCodecs._

  implicit val ModelOfferDTOCodecJson: CodecJson[ModelOfferDTO] = CodecJson.derive[ModelOfferDTO]
  implicit val ModelOfferDTODecoder: EntityDecoder[ModelOfferDTO] = jsonOf[ModelOfferDTO]
  implicit val ModelOfferDTOEncoder: EntityEncoder[ModelOfferDTO] = jsonEncoderOf[ModelOfferDTO]
}
