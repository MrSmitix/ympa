# GetGoodsFeedbackCommentsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GoodsFeedbackCommentListDTO**](GoodsFeedbackCommentListDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetGoodsFeedbackCommentsResponse = Initialize-ympa_powershell_clientGetGoodsFeedbackCommentsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetGoodsFeedbackCommentsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

