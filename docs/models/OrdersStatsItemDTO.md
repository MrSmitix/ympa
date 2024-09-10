

# OrdersStatsItemDTO

Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). 

The class is defined in **[OrdersStatsItemDTO.java](../../src/main/java/org/openapitools/model/OrdersStatsItemDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerName** | `String` | Название товара. |  [optional property]
**marketSku** | `Long` | SKU на Маркете. |  [optional property]
**shopSku** | `String` | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional property]
**count** | `Integer` | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;.  |  [optional property]
**prices** | [`List&lt;OrdersStatsPriceDTO&gt;`](OrdersStatsPriceDTO.md) | Цена или скидки на товар. |  [optional property]
**warehouse** | [`OrdersStatsWarehouseDTO`](OrdersStatsWarehouseDTO.md) |  |  [optional property]
**details** | [`List&lt;OrdersStatsDetailsDTO&gt;`](OrdersStatsDetailsDTO.md) | Информация об удалении товара из заказа. |  [optional property]
**cisList** | `List&lt;String&gt;` | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). |  [optional property]
**initialCount** | `Integer` | Первоначальное количество единиц товара. |  [optional property]
**bidFee** | `Integer` | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  |  [optional property]
**cofinanceThreshold** | `BigDecimal` | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  |  [optional property]
**cofinanceValue** | `BigDecimal` | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  |  [optional property]














