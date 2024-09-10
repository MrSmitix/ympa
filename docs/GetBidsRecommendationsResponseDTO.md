# GetBidsRecommendationsResponseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Recommendations** | [**SkuBidRecommendationItemDTO[]**](SkuBidRecommendationItemDTO.md) | Список товаров с рекомендованными ставками. | 

## Examples

- Prepare the resource
```powershell
$GetBidsRecommendationsResponseDTO = Initialize-ympa_powershell_clientGetBidsRecommendationsResponseDTO  -Recommendations null
```

- Convert the resource to JSON
```powershell
$GetBidsRecommendationsResponseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

