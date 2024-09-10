# OrdersStatsDTO

Информация по заказам.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orders** | [**List[OrdersStatsOrderDTO]**](OrdersStatsOrderDTO.md) | Список заказов. | 
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.orders_stats_dto import OrdersStatsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrdersStatsDTO from a JSON string
orders_stats_dto_instance = OrdersStatsDTO.from_json(json)
# print the JSON string representation of the object
print(OrdersStatsDTO.to_json())

# convert the object into a dict
orders_stats_dto_dict = orders_stats_dto_instance.to_dict()
# create an instance of OrdersStatsDTO from a dict
orders_stats_dto_from_dict = OrdersStatsDTO.from_dict(orders_stats_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


