# GetBidsRecommendationsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GetBidsRecommendationsResponseDTO**](GetBidsRecommendationsResponseDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBidsRecommendationsResponse = Initialize-ympa_powershell_clientGetBidsRecommendationsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetBidsRecommendationsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

