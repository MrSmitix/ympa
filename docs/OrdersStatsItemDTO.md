

# OrdersStatsItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerName** | **String** | Название товара. |  [optional]
**marketSku** | **Long** | SKU на Маркете. |  [optional]
**shopSku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional]
**count** | **Integer** | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;.  |  [optional]
**prices** | [**List&lt;OrdersStatsPriceDTO&gt;**](OrdersStatsPriceDTO.md) | Цена или скидки на товар. |  [optional]
**warehouse** | [**OrdersStatsWarehouseDTO**](OrdersStatsWarehouseDTO.md) |  |  [optional]
**details** | [**List&lt;OrdersStatsDetailsDTO&gt;**](OrdersStatsDetailsDTO.md) | Информация об удалении товара из заказа. |  [optional]
**cisList** | **List&lt;String&gt;** | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). |  [optional]
**initialCount** | **Integer** | Первоначальное количество единиц товара. |  [optional]
**bidFee** | **Integer** | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  |  [optional]
**cofinanceThreshold** | [**BigDecimal**](BigDecimal.md) | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  |  [optional]
**cofinanceValue** | [**BigDecimal**](BigDecimal.md) | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  |  [optional]




