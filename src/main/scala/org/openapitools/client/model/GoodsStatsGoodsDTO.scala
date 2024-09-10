/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model


  /**
   * Информация о товаре.
   */
case class GoodsStatsGoodsDTO(
  /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  shopSku: Option[String] = None,
  /* SKU на Маркете. */
  marketSku: Option[Long] = None,
  /* Название товара. */
  name: Option[String] = None,
  /* Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). */
  price: Option[Double] = None,
  /* Идентификатор категории товара на Маркете. */
  categoryId: Option[Long] = None,
  /* Название категории товара на Маркете. */
  categoryName: Option[String] = None,
  weightDimensions: Option[GoodsStatsWeightDimensionsDTO] = None,
  /* Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  */
  warehouses: Option[Seq[GoodsStatsWarehouseDTO]] = None,
  /* Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  */
  tariffs: Option[Seq[TariffDTO]] = None,
  /* Ссылки (URL) изображений товара в хорошем качестве. */
  pictures: Option[Seq[String]] = None
)

