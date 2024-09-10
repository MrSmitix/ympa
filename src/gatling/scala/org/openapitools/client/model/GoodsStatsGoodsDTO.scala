
package org.openapitools.client.model


case class GoodsStatsGoodsDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _shopSku: Option[String],
    /* SKU на Маркете. */
    _marketSku: Option[Long],
    /* Название товара. */
    _name: Option[String],
    /* Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). */
    _price: Option[Number],
    /* Идентификатор категории товара на Маркете. */
    _categoryId: Option[Long],
    /* Название категории товара на Маркете. */
    _categoryName: Option[String],
    _weightDimensions: Option[GoodsStatsWeightDimensionsDTO],
    /* Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  */
    _warehouses: Option[List[GoodsStatsWarehouseDTO]],
    /* Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  */
    _tariffs: Option[List[TariffDTO]],
    /* Ссылки (URL) изображений товара в хорошем качестве. */
    _pictures: Option[List[String]]
)
object GoodsStatsGoodsDTO {
    def toStringBody(var_shopSku: Object, var_marketSku: Object, var_name: Object, var_price: Object, var_categoryId: Object, var_categoryName: Object, var_weightDimensions: Object, var_warehouses: Object, var_tariffs: Object, var_pictures: Object) =
        s"""
        | {
        | "shopSku":$var_shopSku,"marketSku":$var_marketSku,"name":$var_name,"price":$var_price,"categoryId":$var_categoryId,"categoryName":$var_categoryName,"weightDimensions":$var_weightDimensions,"warehouses":$var_warehouses,"tariffs":$var_tariffs,"pictures":$var_pictures
        | }
        """.stripMargin
}
