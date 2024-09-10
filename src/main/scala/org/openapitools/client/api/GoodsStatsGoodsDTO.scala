package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsStatsGoodsDTO._

case class GoodsStatsGoodsDTO (
  /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  shopSku: Option[String],
/* SKU на Маркете. */
  marketSku: Option[Long],
/* Название товара. */
  name: Option[String],
/* Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). */
  price: Option[BigDecimal],
/* Идентификатор категории товара на Маркете. */
  categoryId: Option[Long],
/* Название категории товара на Маркете. */
  categoryName: Option[String],
weightDimensions: Option[GoodsStatsWeightDimensionsDTO],
/* Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  */
  warehouses: Option[List[GoodsStatsWarehouseDTO]],
/* Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  */
  tariffs: Option[List[TariffDTO]],
/* Ссылки (URL) изображений товара в хорошем качестве. */
  pictures: Option[List[String]])

object GoodsStatsGoodsDTO {
  import DateTimeCodecs._

  implicit val GoodsStatsGoodsDTOCodecJson: CodecJson[GoodsStatsGoodsDTO] = CodecJson.derive[GoodsStatsGoodsDTO]
  implicit val GoodsStatsGoodsDTODecoder: EntityDecoder[GoodsStatsGoodsDTO] = jsonOf[GoodsStatsGoodsDTO]
  implicit val GoodsStatsGoodsDTOEncoder: EntityEncoder[GoodsStatsGoodsDTO] = jsonEncoderOf[GoodsStatsGoodsDTO]
}
