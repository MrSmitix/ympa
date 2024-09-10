# UpdateGoodsFeedbackCommentRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedbackId** | **Int64** | Идентификатор отзыва.  | 
**Comment** | [**UpdateGoodsFeedbackCommentDTO**](UpdateGoodsFeedbackCommentDTO.md) |  | 

## Examples

- Prepare the resource
```powershell
$UpdateGoodsFeedbackCommentRequest = Initialize-ympa_powershell_clientUpdateGoodsFeedbackCommentRequest  -FeedbackId null `
 -Comment null
```

- Convert the resource to JSON
```powershell
$UpdateGoodsFeedbackCommentRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

