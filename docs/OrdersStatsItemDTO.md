# OrdersStatsItemDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferName** | **String** | Название товара. | [optional] 
**MarketSku** | **Int64** | SKU на Маркете. | [optional] 
**ShopSku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**Count** | **Int32** | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;.  | [optional] 
**Prices** | [**OrdersStatsPriceDTO[]**](OrdersStatsPriceDTO.md) | Цена или скидки на товар. | [optional] 
**Warehouse** | [**OrdersStatsWarehouseDTO**](OrdersStatsWarehouseDTO.md) |  | [optional] 
**Details** | [**OrdersStatsDetailsDTO[]**](OrdersStatsDetailsDTO.md) | Информация об удалении товара из заказа. | [optional] 
**CisList** | **String[]** | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional] 
**InitialCount** | **Int32** | Первоначальное количество единиц товара. | [optional] 
**BidFee** | **Int32** | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  | [optional] 
**CofinanceThreshold** | **Decimal** | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  | [optional] 
**CofinanceValue** | **Decimal** | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrdersStatsItemDTO = Initialize-ympa_powershell_clientOrdersStatsItemDTO  -OfferName null `
 -MarketSku null `
 -ShopSku null `
 -Count null `
 -Prices null `
 -Warehouse null `
 -Details null `
 -CisList null `
 -InitialCount null `
 -BidFee 570 `
 -CofinanceThreshold null `
 -CofinanceValue null
```

- Convert the resource to JSON
```powershell
$OrdersStatsItemDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

