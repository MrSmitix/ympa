# FulfillmentWarehouseDTO

Склад Маркета (FBY).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор склада. | 
**name** | **str** | Название склада. | 
**address** | [**WarehouseAddressDTO**](WarehouseAddressDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.fulfillment_warehouse_dto import FulfillmentWarehouseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FulfillmentWarehouseDTO from a JSON string
fulfillment_warehouse_dto_instance = FulfillmentWarehouseDTO.from_json(json)
# print the JSON string representation of the object
print FulfillmentWarehouseDTO.to_json()

# convert the object into a dict
fulfillment_warehouse_dto_dict = fulfillment_warehouse_dto_instance.to_dict()
# create an instance of FulfillmentWarehouseDTO from a dict
fulfillment_warehouse_dto_from_dict = FulfillmentWarehouseDTO.from_dict(fulfillment_warehouse_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


