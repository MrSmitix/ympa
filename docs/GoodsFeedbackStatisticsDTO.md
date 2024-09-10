# GoodsFeedbackStatisticsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rating** | **Int32** | Оценка товара. | 
**CommentsCount** | **Int64** | Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.  | 
**Recommended** | **Boolean** | Рекомендуют ли этот товар. | [optional] 
**PaidAmount** | **Int64** | Количество баллов Плюса, которое автор получил за отзыв. | [optional] 

## Examples

- Prepare the resource
```powershell
$GoodsFeedbackStatisticsDTO = Initialize-ympa_powershell_clientGoodsFeedbackStatisticsDTO  -Rating null `
 -CommentsCount null `
 -Recommended null `
 -PaidAmount null
```

- Convert the resource to JSON
```powershell
$GoodsFeedbackStatisticsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

