# OrderStateDTO

Информация по заказу.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | 
**status** | [**OrderStatusType**](OrderStatusType.md) |  | 
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.order_state_dto import OrderStateDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderStateDTO from a JSON string
order_state_dto_instance = OrderStateDTO.from_json(json)
# print the JSON string representation of the object
print(OrderStateDTO.to_json())

# convert the object into a dict
order_state_dto_dict = order_state_dto_instance.to_dict()
# create an instance of OrderStateDTO from a dict
order_state_dto_from_dict = OrderStateDTO.from_dict(order_state_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


