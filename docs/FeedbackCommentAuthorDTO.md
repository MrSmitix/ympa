# FeedbackCommentAuthorDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**FeedbackCommentAuthorType**](FeedbackCommentAuthorType.md) |  | [optional] 
**Name** | **String** | Имя автора отзыва или название магазина. | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedbackCommentAuthorDTO = Initialize-ympa_powershell_clientFeedbackCommentAuthorDTO  -Type null `
 -Name null
```

- Convert the resource to JSON
```powershell
$FeedbackCommentAuthorDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

