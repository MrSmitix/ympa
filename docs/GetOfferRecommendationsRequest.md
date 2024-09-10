# GetOfferRecommendationsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | **String[]** | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional] 
**CofinancePriceFilter** | [**FieldStateType**](FieldStateType.md) |  | [optional] 
**RecommendedCofinancePriceFilter** | [**FieldStateType**](FieldStateType.md) |  | [optional] 
**CompetitivenessFilter** | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOfferRecommendationsRequest = Initialize-ympa_powershell_clientGetOfferRecommendationsRequest  -OfferIds null `
 -CofinancePriceFilter null `
 -RecommendedCofinancePriceFilter null `
 -CompetitivenessFilter null
```

- Convert the resource to JSON
```powershell
$GetOfferRecommendationsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

