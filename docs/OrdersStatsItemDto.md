# OrdersStatsItemDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_name** | Option<**String**> | Название товара. | [optional]
**market_sku** | Option<**i64**> | SKU на Маркете. | [optional]
**shop_sku** | Option<**String**> | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional]
**count** | Option<**i32**> | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`.  | [optional]
**prices** | Option<[**Vec<models::OrdersStatsPriceDto>**](OrdersStatsPriceDTO.md)> | Цена или скидки на товар. | [optional]
**warehouse** | Option<[**models::OrdersStatsWarehouseDto**](OrdersStatsWarehouseDTO.md)> |  | [optional]
**details** | Option<[**Vec<models::OrdersStatsDetailsDto>**](OrdersStatsDetailsDTO.md)> | Информация об удалении товара из заказа. | [optional]
**cis_list** | Option<**Vec<String>**> | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional]
**initial_count** | Option<**i32**> | Первоначальное количество единиц товара. | [optional]
**bid_fee** | Option<**i32**> | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  | [optional]
**cofinance_threshold** | Option<**f64**> | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  | [optional]
**cofinance_value** | Option<**f64**> | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


