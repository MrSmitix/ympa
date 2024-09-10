package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrdersStatsItemDTO._

case class OrdersStatsItemDTO (
  /* Название товара. */
  offerName: Option[String],
/* SKU на Маркете. */
  marketSku: Option[Long],
/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  shopSku: Option[String],
/* Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`.  */
  count: Option[Integer],
/* Цена или скидки на товар. */
  prices: Option[List[OrdersStatsPriceDTO]],
warehouse: Option[OrdersStatsWarehouseDTO],
/* Информация об удалении товара из заказа. */
  details: Option[List[OrdersStatsDetailsDTO]],
/* Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). */
  cisList: Option[List[String]],
/* Первоначальное количество единиц товара. */
  initialCount: Option[Integer],
/* Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  */
  bidFee: Option[Integer],
/* Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  */
  cofinanceThreshold: Option[BigDecimal],
/* Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  */
  cofinanceValue: Option[BigDecimal])

object OrdersStatsItemDTO {
  import DateTimeCodecs._

  implicit val OrdersStatsItemDTOCodecJson: CodecJson[OrdersStatsItemDTO] = CodecJson.derive[OrdersStatsItemDTO]
  implicit val OrdersStatsItemDTODecoder: EntityDecoder[OrdersStatsItemDTO] = jsonOf[OrdersStatsItemDTO]
  implicit val OrdersStatsItemDTOEncoder: EntityEncoder[OrdersStatsItemDTO] = jsonEncoderOf[OrdersStatsItemDTO]
}
