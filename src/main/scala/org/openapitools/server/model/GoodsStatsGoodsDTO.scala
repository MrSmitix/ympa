package org.openapitools.server.model


/**
 * Информация о товаре.
 *
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param marketSku SKU на Маркете. for example: ''null''
 * @param name Название товара. for example: ''null''
 * @param price Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). for example: ''null''
 * @param categoryId Идентификатор категории товара на Маркете. for example: ''null''
 * @param categoryName Название категории товара на Маркете. for example: ''null''
 * @param weightDimensions  for example: ''null''
 * @param warehouses Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  for example: ''null''
 * @param tariffs Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  for example: ''null''
 * @param pictures Ссылки (URL) изображений товара в хорошем качестве. for example: ''null''
*/
final case class GoodsStatsGoodsDTO (
  shopSku: Option[String] = None,
  marketSku: Option[Long] = None,
  name: Option[String] = None,
  price: Option[Double] = None,
  categoryId: Option[Long] = None,
  categoryName: Option[String] = None,
  weightDimensions: Option[GoodsStatsWeightDimensionsDTO] = None,
  warehouses: Option[Seq[GoodsStatsWarehouseDTO]] = None,
  tariffs: Option[Seq[TariffDTO]] = None,
  pictures: Option[Seq[String]] = None
)

