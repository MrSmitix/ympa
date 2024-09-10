# GoodsFeedbackDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedbackId** | **Int64** | Идентификатор отзыва.  | 
**CreatedAt** | **System.DateTime** | Дата и время создания отзыва. | 
**NeedReaction** | **Boolean** | Нужен ли ответ на отзыв. | 
**Identifiers** | [**GoodsFeedbackIdentifiersDTO**](GoodsFeedbackIdentifiersDTO.md) |  | 
**Author** | **String** | Имя автора отзыва. | [optional] 
**Description** | [**GoodsFeedbackDescriptionDTO**](GoodsFeedbackDescriptionDTO.md) |  | [optional] 
**Media** | [**GoodsFeedbackMediaDTO**](GoodsFeedbackMediaDTO.md) |  | [optional] 
**Statistics** | [**GoodsFeedbackStatisticsDTO**](GoodsFeedbackStatisticsDTO.md) |  | 

## Examples

- Prepare the resource
```powershell
$GoodsFeedbackDTO = Initialize-ympa_powershell_clientGoodsFeedbackDTO  -FeedbackId null `
 -CreatedAt null `
 -NeedReaction null `
 -Identifiers null `
 -Author null `
 -Description null `
 -Media null `
 -Statistics null
```

- Convert the resource to JSON
```powershell
$GoodsFeedbackDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

