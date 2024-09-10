# OrderStatusChangeDTO

Заказ.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**OrderStatusType**](OrderStatusType.md) |  | 
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**delivery** | [**OrderStatusChangeDeliveryDTO**](OrderStatusChangeDeliveryDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_status_change_dto import OrderStatusChangeDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderStatusChangeDTO from a JSON string
order_status_change_dto_instance = OrderStatusChangeDTO.from_json(json)
# print the JSON string representation of the object
print OrderStatusChangeDTO.to_json()

# convert the object into a dict
order_status_change_dto_dict = order_status_change_dto_instance.to_dict()
# create an instance of OrderStatusChangeDTO from a dict
order_status_change_dto_from_dict = OrderStatusChangeDTO.from_dict(order_status_change_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


