# OrdersStatsWarehouseDTO

Информация о складе, на котором хранится товар.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор склада. | [optional] 
**name** | **str** | Название склада. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.orders_stats_warehouse_dto import OrdersStatsWarehouseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrdersStatsWarehouseDTO from a JSON string
orders_stats_warehouse_dto_instance = OrdersStatsWarehouseDTO.from_json(json)
# print the JSON string representation of the object
print OrdersStatsWarehouseDTO.to_json()

# convert the object into a dict
orders_stats_warehouse_dto_dict = orders_stats_warehouse_dto_instance.to_dict()
# create an instance of OrdersStatsWarehouseDTO from a dict
orders_stats_warehouse_dto_from_dict = OrdersStatsWarehouseDTO.from_dict(orders_stats_warehouse_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


