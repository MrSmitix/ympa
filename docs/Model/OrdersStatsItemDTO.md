# OrdersStatsItemDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerName** | **string** | Название товара. | [optional] 
**marketSku** | **int** | SKU на Маркете. | [optional] 
**shopSku** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) | [optional] 
**count** | **int** | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;. | [optional] 
**prices** | [**OpenAPI\Server\Model\OrdersStatsPriceDTO**](OrdersStatsPriceDTO.md) | Цена или скидки на товар. | [optional] 
**warehouse** | [**OpenAPI\Server\Model\OrdersStatsWarehouseDTO**](OrdersStatsWarehouseDTO.md) |  | [optional] 
**details** | [**OpenAPI\Server\Model\OrdersStatsDetailsDTO**](OrdersStatsDetailsDTO.md) | Информация об удалении товара из заказа. | [optional] 
**cisList** | **string** | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional] 
**initialCount** | **int** | Первоначальное количество единиц товара. | [optional] 
**bidFee** | **int** | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. | [optional] 
**cofinanceThreshold** | **float** | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. | [optional] 
**cofinanceValue** | **float** | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


