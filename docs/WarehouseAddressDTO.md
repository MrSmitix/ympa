# WarehouseAddressDTO

Адрес склада.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** | Город. | 
**street** | **str** | Улица. | [optional] 
**number** | **str** | Номер дома. | [optional] 
**building** | **str** | Номер строения. | [optional] 
**block** | **str** | Номер корпуса. | [optional] 
**gps** | [**GpsDTO**](GpsDTO.md) |  | 

## Example

```python
from ympa_python_client.models.warehouse_address_dto import WarehouseAddressDTO

# TODO update the JSON string below
json = "{}"
# create an instance of WarehouseAddressDTO from a JSON string
warehouse_address_dto_instance = WarehouseAddressDTO.from_json(json)
# print the JSON string representation of the object
print(WarehouseAddressDTO.to_json())

# convert the object into a dict
warehouse_address_dto_dict = warehouse_address_dto_instance.to_dict()
# create an instance of WarehouseAddressDTO from a dict
warehouse_address_dto_from_dict = WarehouseAddressDTO.from_dict(warehouse_address_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


