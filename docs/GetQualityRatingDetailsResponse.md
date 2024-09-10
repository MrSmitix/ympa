# GetQualityRatingDetailsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**QualityRatingDetailsDTO**](QualityRatingDetailsDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetQualityRatingDetailsResponse = Initialize-ympa_powershell_clientGetQualityRatingDetailsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetQualityRatingDetailsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

