# WarehouseGroupDTO

Информация о группе складов.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Название группы складов. | 
**main_warehouse** | [**WarehouseDTO**](WarehouseDTO.md) |  | 
**warehouses** | [**List[WarehouseDTO]**](WarehouseDTO.md) | Список складов, входящих в группу. | 

## Example

```python
from ympa_python_client.models.warehouse_group_dto import WarehouseGroupDTO

# TODO update the JSON string below
json = "{}"
# create an instance of WarehouseGroupDTO from a JSON string
warehouse_group_dto_instance = WarehouseGroupDTO.from_json(json)
# print the JSON string representation of the object
print(WarehouseGroupDTO.to_json())

# convert the object into a dict
warehouse_group_dto_dict = warehouse_group_dto_instance.to_dict()
# create an instance of WarehouseGroupDTO from a dict
warehouse_group_dto_from_dict = WarehouseGroupDTO.from_dict(warehouse_group_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


