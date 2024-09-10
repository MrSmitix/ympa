package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferDTO._

case class OfferDTO (
  /* Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.  */
  price: Option[BigDecimal],
/* Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.  */
  feedId: Option[Long],
/* Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.  */
  id: Option[String],
/* Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  */
  shopCategoryId: Option[String],
/* Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.  */
  marketCategoryId: Option[Integer],
/* Цена предложения без скидки. */
  preDiscountPrice: Option[BigDecimal],
/* Скидка на предложение в процентах. */
  discount: Option[Integer],
/* Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API.  */
  cutPrice: Option[Boolean],
/* URL-адрес предложения на сайте магазина. */
  url: Option[String],
/* Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %}  */
  modelId: Long,
/* Наименование предложения. */
  name: Option[String],
currency: Option[CurrencyType],
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  */
  bid: Option[BigDecimal],
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  */
  cbid: Option[BigDecimal],
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.  */
  fee: Option[BigDecimal],
/* Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.  */
  blocked: Option[Boolean])

object OfferDTO {
  import DateTimeCodecs._

  implicit val OfferDTOCodecJson: CodecJson[OfferDTO] = CodecJson.derive[OfferDTO]
  implicit val OfferDTODecoder: EntityDecoder[OfferDTO] = jsonOf[OfferDTO]
  implicit val OfferDTOEncoder: EntityEncoder[OfferDTO] = jsonEncoderOf[OfferDTO]
}
