# UpdateGoodsFeedbackCommentResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GoodsFeedbackCommentDTO**](GoodsFeedbackCommentDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateGoodsFeedbackCommentResponse = Initialize-ympa_powershell_clientUpdateGoodsFeedbackCommentResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$UpdateGoodsFeedbackCommentResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

