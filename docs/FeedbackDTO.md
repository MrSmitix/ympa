# WWW::OpenAPIClient::Object::FeedbackDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::FeedbackDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор отзыва. | [optional] 
**created_at** | **DATE_TIME** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**text** | **string** | Комментарий автора отзыва. | [optional] 
**state** | [**FeedbackStateType**](FeedbackStateType.md) |  | [optional] 
**author** | [**FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  | [optional] 
**pro** | **string** | Достоинства магазина, описанные в отзыве. | [optional] 
**contra** | **string** | Недостатки магазина, описанные в отзыве. | [optional] 
**comments** | [**ARRAY[FeedbackCommentDTO]**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**shop** | [**FeedbackShopDTO**](FeedbackShopDTO.md) |  | [optional] 
**resolved** | **boolean** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] 
**verified** | **boolean** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**recommend** | **boolean** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**grades** | [**FeedbackGradesDTO**](FeedbackGradesDTO.md) |  | [optional] 
**order** | [**FeedbackOrderDTO**](FeedbackOrderDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


