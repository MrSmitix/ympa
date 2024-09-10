# GoodsFeedbackCommentListDTO

Комментарии к отзыву.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | [**List[GoodsFeedbackCommentDTO]**](GoodsFeedbackCommentDTO.md) | Список комментариев. | 
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.goods_feedback_comment_list_dto import GoodsFeedbackCommentListDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsFeedbackCommentListDTO from a JSON string
goods_feedback_comment_list_dto_instance = GoodsFeedbackCommentListDTO.from_json(json)
# print the JSON string representation of the object
print GoodsFeedbackCommentListDTO.to_json()

# convert the object into a dict
goods_feedback_comment_list_dto_dict = goods_feedback_comment_list_dto_instance.to_dict()
# create an instance of GoodsFeedbackCommentListDTO from a dict
goods_feedback_comment_list_dto_from_dict = GoodsFeedbackCommentListDTO.from_dict(goods_feedback_comment_list_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


