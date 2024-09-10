# WarehousesDTO

Информация о складах и группах складов.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warehouses** | [**List[WarehouseDTO]**](WarehouseDTO.md) | Список складов, не входящих в группы. | 
**warehouse_groups** | [**List[WarehouseGroupDTO]**](WarehouseGroupDTO.md) | Список групп складов. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.warehouses_dto import WarehousesDTO

# TODO update the JSON string below
json = "{}"
# create an instance of WarehousesDTO from a JSON string
warehouses_dto_instance = WarehousesDTO.from_json(json)
# print the JSON string representation of the object
print WarehousesDTO.to_json()

# convert the object into a dict
warehouses_dto_dict = warehouses_dto_instance.to_dict()
# create an instance of WarehousesDTO from a dict
warehouses_dto_from_dict = WarehousesDTO.from_dict(warehouses_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


