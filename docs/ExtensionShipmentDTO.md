# ExtensionShipmentDTO

Информация об отгрузке.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current_status** | [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] 
**available_actions** | [**List[ShipmentActionType]**](ShipmentActionType.md) | Доступные действия над отгрузкой. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.extension_shipment_dto import ExtensionShipmentDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ExtensionShipmentDTO from a JSON string
extension_shipment_dto_instance = ExtensionShipmentDTO.from_json(json)
# print the JSON string representation of the object
print ExtensionShipmentDTO.to_json()

# convert the object into a dict
extension_shipment_dto_dict = extension_shipment_dto_instance.to_dict()
# create an instance of ExtensionShipmentDTO from a dict
extension_shipment_dto_from_dict = ExtensionShipmentDTO.from_dict(extension_shipment_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


