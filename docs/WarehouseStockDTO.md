# WarehouseStockDTO

Информация об остатках товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**WarehouseStockType**](WarehouseStockType.md) |  | 
**count** | **int** | Значение остатков. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.warehouse_stock_dto import WarehouseStockDTO

# TODO update the JSON string below
json = "{}"
# create an instance of WarehouseStockDTO from a JSON string
warehouse_stock_dto_instance = WarehouseStockDTO.from_json(json)
# print the JSON string representation of the object
print WarehouseStockDTO.to_json()

# convert the object into a dict
warehouse_stock_dto_dict = warehouse_stock_dto_instance.to_dict()
# create an instance of WarehouseStockDTO from a dict
warehouse_stock_dto_from_dict = WarehouseStockDTO.from_dict(warehouse_stock_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


