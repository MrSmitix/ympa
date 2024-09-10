# OrdersStatsItemDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerName** | **String!** | Название товара. | [optional] [default to null]
**marketSku** | **Int!** | SKU на Маркете. | [optional] [default to null]
**shopSku** | **String!** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to null]
**count** | **Int!** | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;.  | [optional] [default to null]
**prices** | [**OrdersStatsPriceDto**](OrdersStatsPriceDTO.md) | Цена или скидки на товар. | [optional] [default to null]
**warehouse** | [***OrdersStatsWarehouseDto**](OrdersStatsWarehouseDTO.md) |  | [optional] [default to null]
**details** | [**OrdersStatsDetailsDto**](OrdersStatsDetailsDTO.md) | Информация об удалении товара из заказа. | [optional] [default to null]
**cisList** | **String!** | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional] [default to null]
**initialCount** | **Int!** | Первоначальное количество единиц товара. | [optional] [default to null]
**bidFee** | **Int!** | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  | [optional] [default to null]
**cofinanceThreshold** | **Float!** | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  | [optional] [default to null]
**cofinanceValue** | **Float!** | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


