
package org.openapitools.client.model


case class OrdersStatsItemDTO (
    /* Название товара. */
    _offerName: Option[String],
    /* SKU на Маркете. */
    _marketSku: Option[Long],
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _shopSku: Option[String],
    /* Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`.  */
    _count: Option[Integer],
    /* Цена или скидки на товар. */
    _prices: Option[List[OrdersStatsPriceDTO]],
    _warehouse: Option[OrdersStatsWarehouseDTO],
    /* Информация об удалении товара из заказа. */
    _details: Option[List[OrdersStatsDetailsDTO]],
    /* Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). */
    _cisList: Option[List[String]],
    /* Первоначальное количество единиц товара. */
    _initialCount: Option[Integer],
    /* Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  */
    _bidFee: Option[Integer],
    /* Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  */
    _cofinanceThreshold: Option[Number],
    /* Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  */
    _cofinanceValue: Option[Number]
)
object OrdersStatsItemDTO {
    def toStringBody(var_offerName: Object, var_marketSku: Object, var_shopSku: Object, var_count: Object, var_prices: Object, var_warehouse: Object, var_details: Object, var_cisList: Object, var_initialCount: Object, var_bidFee: Object, var_cofinanceThreshold: Object, var_cofinanceValue: Object) =
        s"""
        | {
        | "offerName":$var_offerName,"marketSku":$var_marketSku,"shopSku":$var_shopSku,"count":$var_count,"prices":$var_prices,"warehouse":$var_warehouse,"details":$var_details,"cisList":$var_cisList,"initialCount":$var_initialCount,"bidFee":$var_bidFee,"cofinanceThreshold":$var_cofinanceThreshold,"cofinanceValue":$var_cofinanceValue
        | }
        """.stripMargin
}
