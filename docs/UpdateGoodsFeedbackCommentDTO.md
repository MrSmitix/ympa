# UpdateGoodsFeedbackCommentDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор комментария к отзыву.  | [optional] 
**ParentId** | **Int64** | Идентификатор комментария к отзыву.  | [optional] 
**Text** | **String** | Текст комментария. | 

## Examples

- Prepare the resource
```powershell
$UpdateGoodsFeedbackCommentDTO = Initialize-ympa_powershell_clientUpdateGoodsFeedbackCommentDTO  -Id null `
 -ParentId null `
 -Text null
```

- Convert the resource to JSON
```powershell
$UpdateGoodsFeedbackCommentDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

