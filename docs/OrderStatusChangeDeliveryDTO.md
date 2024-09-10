# OrderStatusChangeDeliveryDTO

Информация о доставке.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dates** | [**OrderStatusChangeDeliveryDatesDTO**](OrderStatusChangeDeliveryDatesDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.order_status_change_delivery_dto import OrderStatusChangeDeliveryDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderStatusChangeDeliveryDTO from a JSON string
order_status_change_delivery_dto_instance = OrderStatusChangeDeliveryDTO.from_json(json)
# print the JSON string representation of the object
print(OrderStatusChangeDeliveryDTO.to_json())

# convert the object into a dict
order_status_change_delivery_dto_dict = order_status_change_delivery_dto_instance.to_dict()
# create an instance of OrderStatusChangeDeliveryDTO from a dict
order_status_change_delivery_dto_from_dict = OrderStatusChangeDeliveryDTO.from_dict(order_status_change_delivery_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


