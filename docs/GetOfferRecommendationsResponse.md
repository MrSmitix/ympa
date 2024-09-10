# GetOfferRecommendationsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OfferRecommendationsResultDTO**](OfferRecommendationsResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOfferRecommendationsResponse = Initialize-ympa_powershell_clientGetOfferRecommendationsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetOfferRecommendationsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

