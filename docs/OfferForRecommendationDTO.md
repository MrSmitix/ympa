# OfferForRecommendationDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**Price** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**CofinancePrice** | [**GetPriceDTO**](GetPriceDTO.md) |  | [optional] 
**Competitiveness** | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] 
**Shows** | **Int64** | Количество показов карточки товара за последние 7 дней. | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferForRecommendationDTO = Initialize-ympa_powershell_clientOfferForRecommendationDTO  -OfferId null `
 -Price null `
 -CofinancePrice null `
 -Competitiveness null `
 -Shows null
```

- Convert the resource to JSON
```powershell
$OfferForRecommendationDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

