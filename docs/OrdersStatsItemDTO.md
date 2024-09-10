# OrdersStatsItemDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerName** | **String** | Название товара. | [optional] [default to nothing]
**marketSku** | **Int64** | SKU на Маркете. | [optional] [default to nothing]
**shopSku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to nothing]
**count** | **Int64** | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;.  | [optional] [default to nothing]
**prices** | [**Vector{OrdersStatsPriceDTO}**](OrdersStatsPriceDTO.md) | Цена или скидки на товар. | [optional] [default to nothing]
**warehouse** | [***OrdersStatsWarehouseDTO**](OrdersStatsWarehouseDTO.md) |  | [optional] [default to nothing]
**details** | [**Vector{OrdersStatsDetailsDTO}**](OrdersStatsDetailsDTO.md) | Информация об удалении товара из заказа. | [optional] [default to nothing]
**cisList** | **Vector{String}** | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional] [default to nothing]
**initialCount** | **Int64** | Первоначальное количество единиц товара. | [optional] [default to nothing]
**bidFee** | **Int64** | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  | [optional] [default to nothing]
**cofinanceThreshold** | **Float64** | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  | [optional] [default to nothing]
**cofinanceValue** | **Float64** | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


