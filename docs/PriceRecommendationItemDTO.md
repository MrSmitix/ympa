# PriceRecommendationItemDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **Int64** | Идентификатор кампании. | 
**Price** | **Decimal** | Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)  | 

## Examples

- Prepare the resource
```powershell
$PriceRecommendationItemDTO = Initialize-ympa_powershell_clientPriceRecommendationItemDTO  -CampaignId null `
 -Price null
```

- Convert the resource to JSON
```powershell
$PriceRecommendationItemDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

