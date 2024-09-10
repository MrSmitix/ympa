# WarehouseDTO

Информация о складе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор склада. | 
**name** | **str** | Название склада. | 
**campaign_id** | **int** | Идентификатор кампании в API и идентификатор магазина. | 
**express** | **bool** | Возможна ли доставка по модели Экспресс. | 
**address** | [**WarehouseAddressDTO**](WarehouseAddressDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.warehouse_dto import WarehouseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of WarehouseDTO from a JSON string
warehouse_dto_instance = WarehouseDTO.from_json(json)
# print the JSON string representation of the object
print(WarehouseDTO.to_json())

# convert the object into a dict
warehouse_dto_dict = warehouse_dto_instance.to_dict()
# create an instance of WarehouseDTO from a dict
warehouse_dto_from_dict = WarehouseDTO.from_dict(warehouse_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


