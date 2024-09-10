# OfferRecommendationDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offer** | [**OfferForRecommendationDTO**](OfferForRecommendationDTO.md) |  | [optional] 
**Recommendation** | [**OfferRecommendationInfoDTO**](OfferRecommendationInfoDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferRecommendationDTO = Initialize-ympa_powershell_clientOfferRecommendationDTO  -Offer null `
 -Recommendation null
```

- Convert the resource to JSON
```powershell
$OfferRecommendationDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

