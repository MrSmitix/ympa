# GoodsFeedbackCommentDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор комментария к отзыву.  | 
**Text** | **String** | Текст комментария. | 
**CanModify** | **Boolean** | Может ли продавец изменять комментарий или удалять его. | [optional] 
**ParentId** | **Int64** | Идентификатор комментария к отзыву.  | [optional] 
**Author** | [**GoodsFeedbackCommentAuthorDTO**](GoodsFeedbackCommentAuthorDTO.md) |  | 
**Status** | [**GoodsFeedbackCommentStatusType**](GoodsFeedbackCommentStatusType.md) |  | 

## Examples

- Prepare the resource
```powershell
$GoodsFeedbackCommentDTO = Initialize-ympa_powershell_clientGoodsFeedbackCommentDTO  -Id null `
 -Text null `
 -CanModify null `
 -ParentId null `
 -Author null `
 -Status null
```

- Convert the resource to JSON
```powershell
$GoodsFeedbackCommentDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

