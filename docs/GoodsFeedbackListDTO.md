# GoodsFeedbackListDTO

Список отзывов о товарах. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedbacks** | [**List[GoodsFeedbackDTO]**](GoodsFeedbackDTO.md) | Список отзывов. | 
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.goods_feedback_list_dto import GoodsFeedbackListDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsFeedbackListDTO from a JSON string
goods_feedback_list_dto_instance = GoodsFeedbackListDTO.from_json(json)
# print the JSON string representation of the object
print(GoodsFeedbackListDTO.to_json())

# convert the object into a dict
goods_feedback_list_dto_dict = goods_feedback_list_dto_instance.to_dict()
# create an instance of GoodsFeedbackListDTO from a dict
goods_feedback_list_dto_from_dict = GoodsFeedbackListDTO.from_dict(goods_feedback_list_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


