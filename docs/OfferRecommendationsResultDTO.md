# OfferRecommendationsResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**OfferRecommendations** | [**OfferRecommendationDTO[]**](OfferRecommendationDTO.md) | Страница списка товаров. | 

## Examples

- Prepare the resource
```powershell
$OfferRecommendationsResultDTO = Initialize-ympa_powershell_clientOfferRecommendationsResultDTO  -Paging null `
 -OfferRecommendations null
```

- Convert the resource to JSON
```powershell
$OfferRecommendationsResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

