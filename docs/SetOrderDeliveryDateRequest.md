# SetOrderDeliveryDateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dates** | [**OrderDeliveryDateDTO**](OrderDeliveryDateDTO.md) |  | 
**reason** | [**OrderDeliveryDateReasonType**](OrderDeliveryDateReasonType.md) |  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.set_order_delivery_date_request import SetOrderDeliveryDateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SetOrderDeliveryDateRequest from a JSON string
set_order_delivery_date_request_instance = SetOrderDeliveryDateRequest.from_json(json)
# print the JSON string representation of the object
print SetOrderDeliveryDateRequest.to_json()

# convert the object into a dict
set_order_delivery_date_request_dict = set_order_delivery_date_request_instance.to_dict()
# create an instance of SetOrderDeliveryDateRequest from a dict
set_order_delivery_date_request_from_dict = SetOrderDeliveryDateRequest.from_dict(set_order_delivery_date_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


