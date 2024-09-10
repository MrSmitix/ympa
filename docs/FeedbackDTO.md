# FeedbackDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор отзыва. | [optional] 
**CreatedAt** | **System.DateTime** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**Text** | **String** | Комментарий автора отзыва. | [optional] 
**State** | [**FeedbackStateType**](FeedbackStateType.md) |  | [optional] 
**Author** | [**FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  | [optional] 
**Pro** | **String** | Достоинства магазина, описанные в отзыве. | [optional] 
**Contra** | **String** | Недостатки магазина, описанные в отзыве. | [optional] 
**Comments** | [**FeedbackCommentDTO[]**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**Shop** | [**FeedbackShopDTO**](FeedbackShopDTO.md) |  | [optional] 
**Resolved** | **Boolean** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] 
**Verified** | **Boolean** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**Recommend** | **Boolean** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**Grades** | [**FeedbackGradesDTO**](FeedbackGradesDTO.md) |  | [optional] 
**Order** | [**FeedbackOrderDTO**](FeedbackOrderDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedbackDTO = Initialize-ympa_powershell_clientFeedbackDTO  -Id null `
 -CreatedAt null `
 -Text null `
 -State null `
 -Author null `
 -Pro null `
 -Contra null `
 -Comments null `
 -Shop null `
 -Resolved null `
 -Verified null `
 -Recommend null `
 -Grades null `
 -Order null
```

- Convert the resource to JSON
```powershell
$FeedbackDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

