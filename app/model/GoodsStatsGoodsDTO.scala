package model

import play.api.libs.json._

/**
  * Информация о товаре.
  * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @param marketSku SKU на Маркете.
  * @param name Название товара.
  * @param price Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
  * @param categoryId Идентификатор категории товара на Маркете.
  * @param categoryName Название категории товара на Маркете.
  * @param warehouses Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
  * @param tariffs Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
  * @param pictures Ссылки (URL) изображений товара в хорошем качестве.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsStatsGoodsDTO(
  shopSku: Option[String],
  marketSku: Option[Long],
  name: Option[String],
  price: Option[BigDecimal],
  categoryId: Option[Long],
  categoryName: Option[String],
  weightDimensions: Option[GoodsStatsWeightDimensionsDTO],
  warehouses: Option[List[GoodsStatsWarehouseDTO]],
  tariffs: Option[List[TariffDTO]],
  pictures: Option[List[String]]
)

object GoodsStatsGoodsDTO {
  implicit lazy val goodsStatsGoodsDTOJsonFormat: Format[GoodsStatsGoodsDTO] = Json.format[GoodsStatsGoodsDTO]
}

