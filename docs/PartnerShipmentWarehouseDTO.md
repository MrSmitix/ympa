# PartnerShipmentWarehouseDTO

Данные о складе отправления.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор склада отправления. | [optional] 
**name** | **str** | Наименование склада отправления. | [optional] 
**address** | **str** | Адрес склада отправления. | [optional] 

## Example

```python
from ympa_python_client.models.partner_shipment_warehouse_dto import PartnerShipmentWarehouseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PartnerShipmentWarehouseDTO from a JSON string
partner_shipment_warehouse_dto_instance = PartnerShipmentWarehouseDTO.from_json(json)
# print the JSON string representation of the object
print(PartnerShipmentWarehouseDTO.to_json())

# convert the object into a dict
partner_shipment_warehouse_dto_dict = partner_shipment_warehouse_dto_instance.to_dict()
# create an instance of PartnerShipmentWarehouseDTO from a dict
partner_shipment_warehouse_dto_from_dict = PartnerShipmentWarehouseDTO.from_dict(partner_shipment_warehouse_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


