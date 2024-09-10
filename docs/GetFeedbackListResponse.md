# GetFeedbackListResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**FeedbackListDTO**](FeedbackListDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetFeedbackListResponse = Initialize-ympa_powershell_clientGetFeedbackListResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetFeedbackListResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

