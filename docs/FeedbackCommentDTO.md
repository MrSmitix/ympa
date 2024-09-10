# FeedbackCommentDTO

Комментарий к отзыву на магазин.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор ответа. | [optional] 
**parent_id** | **int** | Идентификатор родительского ответа. | [optional] 
**body** | **str** | Текст ответа. | [optional] 
**created_at** | **datetime** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**updated_at** | **datetime** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**author** | [**FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  | [optional] 
**children** | [**List[FeedbackCommentDTO]**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.feedback_comment_dto import FeedbackCommentDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedbackCommentDTO from a JSON string
feedback_comment_dto_instance = FeedbackCommentDTO.from_json(json)
# print the JSON string representation of the object
print FeedbackCommentDTO.to_json()

# convert the object into a dict
feedback_comment_dto_dict = feedback_comment_dto_instance.to_dict()
# create an instance of FeedbackCommentDTO from a dict
feedback_comment_dto_from_dict = FeedbackCommentDTO.from_dict(feedback_comment_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


