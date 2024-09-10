# GoodsFeedbackCommentDTO

Комментарий к отзыву.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор комментария к отзыву.  | 
**text** | **str** | Текст комментария. | 
**can_modify** | **bool** | Может ли продавец изменять комментарий или удалять его. | [optional] 
**parent_id** | **int** | Идентификатор комментария к отзыву.  | [optional] 
**author** | [**GoodsFeedbackCommentAuthorDTO**](GoodsFeedbackCommentAuthorDTO.md) |  | 
**status** | [**GoodsFeedbackCommentStatusType**](GoodsFeedbackCommentStatusType.md) |  | 

## Example

```python
from ympa_python_client.models.goods_feedback_comment_dto import GoodsFeedbackCommentDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsFeedbackCommentDTO from a JSON string
goods_feedback_comment_dto_instance = GoodsFeedbackCommentDTO.from_json(json)
# print the JSON string representation of the object
print(GoodsFeedbackCommentDTO.to_json())

# convert the object into a dict
goods_feedback_comment_dto_dict = goods_feedback_comment_dto_instance.to_dict()
# create an instance of GoodsFeedbackCommentDTO from a dict
goods_feedback_comment_dto_from_dict = GoodsFeedbackCommentDTO.from_dict(goods_feedback_comment_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


