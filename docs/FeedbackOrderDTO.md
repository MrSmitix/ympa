# FeedbackOrderDTO

Информация о заказе, указанная в отзыве.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shop_order_id** | **str** | Номер заказа, указанный в отзыве. | [optional] 
**delivery** | [**FeedbackDeliveryType**](FeedbackDeliveryType.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.feedback_order_dto import FeedbackOrderDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FeedbackOrderDTO from a JSON string
feedback_order_dto_instance = FeedbackOrderDTO.from_json(json)
# print the JSON string representation of the object
print(FeedbackOrderDTO.to_json())

# convert the object into a dict
feedback_order_dto_dict = feedback_order_dto_instance.to_dict()
# create an instance of FeedbackOrderDTO from a dict
feedback_order_dto_from_dict = FeedbackOrderDTO.from_dict(feedback_order_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


