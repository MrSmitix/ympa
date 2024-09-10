# FeedbackDTO

Отзыв пользователя Яндекс Маркета об указанном магазине.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор отзыва. | [optional] 
**created_at** | **datetime** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**text** | **str** | Комментарий автора отзыва. | [optional] 
**state** | [**FeedbackStateType**](FeedbackStateType.md) |  | [optional] 
**author** | [**FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  | [optional] 
**pro** | **str** | Достоинства магазина, описанные в отзыве. | [optional] 
**contra** | **str** | Недостатки магазина, описанные в отзыве. | [optional] 
**comments** | [**List[FeedbackCommentDTO]**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**shop** | [**FeedbackShopDTO**](FeedbackShopDTO.md) |  | [optional] 
**resolved** | **bool** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] 
**verified** | **bool** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**recommend** | **bool** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**grades** | [**FeedbackGradesDTO**](FeedbackGradesDTO.md) |  | [optional] 
**order** | [**FeedbackOrderDTO**](FeedbackOrderDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.feedback_dto import FeedbackDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedbackDTO from a JSON string
feedback_dto_instance = FeedbackDTO.from_json(json)
# print the JSON string representation of the object
print(FeedbackDTO.to_json())

# convert the object into a dict
feedback_dto_dict = feedback_dto_instance.to_dict()
# create an instance of FeedbackDTO from a dict
feedback_dto_from_dict = FeedbackDTO.from_dict(feedback_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


