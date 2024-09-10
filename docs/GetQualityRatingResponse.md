# GetQualityRatingResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**CampaignsQualityRatingDTO**](CampaignsQualityRatingDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetQualityRatingResponse = Initialize-ympa_powershell_clientGetQualityRatingResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetQualityRatingResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

