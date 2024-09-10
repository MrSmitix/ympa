# ORDERS_STATS_ITEM_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_name** | [**STRING_32**](STRING_32.md) | Название товара. | [optional] [default to null]
**market_sku** | **INTEGER_64** | SKU на Маркете. | [optional] [default to null]
**shop_sku** | [**STRING_32**](STRING_32.md) | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to null]
**count** | **INTEGER_32** | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;.  | [optional] [default to null]
**prices** | [**LIST [ORDERS_STATS_PRICE_DTO]**](OrdersStatsPriceDTO.md) | Цена или скидки на товар. | [optional] [default to null]
**warehouse** | [**ORDERS_STATS_WAREHOUSE_DTO**](OrdersStatsWarehouseDTO.md) |  | [optional] [default to null]
**details** | [**LIST [ORDERS_STATS_DETAILS_DTO]**](OrdersStatsDetailsDTO.md) | Информация об удалении товара из заказа. | [optional] [default to null]
**cis_list** | [**LIST [STRING_32]**](STRING_32.md) | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional] [default to null]
**initial_count** | **INTEGER_32** | Первоначальное количество единиц товара. | [optional] [default to null]
**bid_fee** | **INTEGER_32** | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  | [optional] [default to null]
**cofinance_threshold** | **REAL_32** | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  | [optional] [default to null]
**cofinance_value** | **REAL_32** | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


