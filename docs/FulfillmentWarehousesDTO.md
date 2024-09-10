# FulfillmentWarehousesDTO

Список складов Маркета (FBY).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warehouses** | [**List[FulfillmentWarehouseDTO]**](FulfillmentWarehouseDTO.md) | Список складов Маркета (FBY). | 

## Example

```python
from ympa_python_client.models.fulfillment_warehouses_dto import FulfillmentWarehousesDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FulfillmentWarehousesDTO from a JSON string
fulfillment_warehouses_dto_instance = FulfillmentWarehousesDTO.from_json(json)
# print the JSON string representation of the object
print(FulfillmentWarehousesDTO.to_json())

# convert the object into a dict
fulfillment_warehouses_dto_dict = fulfillment_warehouses_dto_instance.to_dict()
# create an instance of FulfillmentWarehousesDTO from a dict
fulfillment_warehouses_dto_from_dict = FulfillmentWarehousesDTO.from_dict(fulfillment_warehouses_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


