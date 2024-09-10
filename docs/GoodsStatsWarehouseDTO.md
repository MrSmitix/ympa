# GoodsStatsWarehouseDTO

Информация о складе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор склада. | [optional] 
**name** | **str** | Название склада. | [optional] 
**stocks** | [**List[WarehouseStockDTO]**](WarehouseStockDTO.md) | Информация об остатках товаров на складе. | 

## Example

```python
from ympa_python_client.models.goods_stats_warehouse_dto import GoodsStatsWarehouseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsStatsWarehouseDTO from a JSON string
goods_stats_warehouse_dto_instance = GoodsStatsWarehouseDTO.from_json(json)
# print the JSON string representation of the object
print(GoodsStatsWarehouseDTO.to_json())

# convert the object into a dict
goods_stats_warehouse_dto_dict = goods_stats_warehouse_dto_instance.to_dict()
# create an instance of GoodsStatsWarehouseDTO from a dict
goods_stats_warehouse_dto_from_dict = GoodsStatsWarehouseDTO.from_dict(goods_stats_warehouse_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


