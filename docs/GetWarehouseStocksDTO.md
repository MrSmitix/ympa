# GetWarehouseStocksDTO

Список складов с информацией об остатках на каждом из них.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**warehouses** | [**List[WarehouseOffersDTO]**](WarehouseOffersDTO.md) | Страница списка складов. | 

## Example

```python
from ympa_python_client.models.get_warehouse_stocks_dto import GetWarehouseStocksDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetWarehouseStocksDTO from a JSON string
get_warehouse_stocks_dto_instance = GetWarehouseStocksDTO.from_json(json)
# print the JSON string representation of the object
print(GetWarehouseStocksDTO.to_json())

# convert the object into a dict
get_warehouse_stocks_dto_dict = get_warehouse_stocks_dto_instance.to_dict()
# create an instance of GetWarehouseStocksDTO from a dict
get_warehouse_stocks_dto_from_dict = GetWarehouseStocksDTO.from_dict(get_warehouse_stocks_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


