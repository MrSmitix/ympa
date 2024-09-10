# GetOrdersResponse

Модель для ответа API списка информации по заказам.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 
**orders** | [**List[OrderDTO]**](OrderDTO.md) | Модель заказа.  | 
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_orders_response import GetOrdersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetOrdersResponse from a JSON string
get_orders_response_instance = GetOrdersResponse.from_json(json)
# print the JSON string representation of the object
print GetOrdersResponse.to_json()

# convert the object into a dict
get_orders_response_dict = get_orders_response_instance.to_dict()
# create an instance of GetOrdersResponse from a dict
get_orders_response_from_dict = GetOrdersResponse.from_dict(get_orders_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


