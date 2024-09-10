# GoodsFeedbackCommentAuthorDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**GoodsFeedbackCommentAuthorType**](GoodsFeedbackCommentAuthorType.md) |  | [optional] 
**Name** | **String** | Имя автора или название кабинета. | [optional] 

## Examples

- Prepare the resource
```powershell
$GoodsFeedbackCommentAuthorDTO = Initialize-ympa_powershell_clientGoodsFeedbackCommentAuthorDTO  -Type null `
 -Name null
```

- Convert the resource to JSON
```powershell
$GoodsFeedbackCommentAuthorDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

