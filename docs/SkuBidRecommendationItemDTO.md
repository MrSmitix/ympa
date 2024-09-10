# SkuBidRecommendationItemDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Sku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Bid** | **Int32** | Значение ставки. | 
**BidRecommendations** | [**BidRecommendationItemDTO[]**](BidRecommendationItemDTO.md) | Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить.  | [optional] 
**PriceRecommendations** | [**PriceRecommendationItemDTO[]**](PriceRecommendationItemDTO.md) | Рекомендованные цены. | [optional] 

## Examples

- Prepare the resource
```powershell
$SkuBidRecommendationItemDTO = Initialize-ympa_powershell_clientSkuBidRecommendationItemDTO  -Sku null `
 -Bid 570 `
 -BidRecommendations null `
 -PriceRecommendations null
```

- Convert the resource to JSON
```powershell
$SkuBidRecommendationItemDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

