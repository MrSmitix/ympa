# FeedbackShopDTO

Информация о магазине.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Название магазина. | [optional] 

## Example

```python
from ympa_python_client.models.feedback_shop_dto import FeedbackShopDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedbackShopDTO from a JSON string
feedback_shop_dto_instance = FeedbackShopDTO.from_json(json)
# print the JSON string representation of the object
print(FeedbackShopDTO.to_json())

# convert the object into a dict
feedback_shop_dto_dict = feedback_shop_dto_instance.to_dict()
# create an instance of FeedbackShopDTO from a dict
feedback_shop_dto_from_dict = FeedbackShopDTO.from_dict(feedback_shop_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


