# OrdersStatsItemDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_name** | **String** | Название товара. | [optional] [default to None]
**market_sku** | **i64** | SKU на Маркете. | [optional] [default to None]
**shop_sku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to None]
**count** | **i32** | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`.  | [optional] [default to None]
**prices** | [**Vec<models::OrdersStatsPriceDto>**](OrdersStatsPriceDTO.md) | Цена или скидки на товар. | [optional] [default to None]
**warehouse** | [***models::OrdersStatsWarehouseDto**](OrdersStatsWarehouseDTO.md) |  | [optional] [default to None]
**details** | [**Vec<models::OrdersStatsDetailsDto>**](OrdersStatsDetailsDTO.md) | Информация об удалении товара из заказа. | [optional] [default to None]
**cis_list** | **Vec<String>** | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional] [default to None]
**initial_count** | **i32** | Первоначальное количество единиц товара. | [optional] [default to None]
**bid_fee** | **u32** | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  | [optional] [default to None]
**cofinance_threshold** | **f64** | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  | [optional] [default to None]
**cofinance_value** | **f64** | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


