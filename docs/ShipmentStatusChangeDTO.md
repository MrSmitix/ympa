# ShipmentStatusChangeDTO

Статус отгрузки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ShipmentStatusType**](ShipmentStatusType.md) |  | [optional] 
**description** | **str** | Описание статуса отгрузки. | [optional] 
**update_time** | **datetime** | Время последнего изменения статуса отгрузки. | [optional] 

## Example

```python
from ympa_python_client.models.shipment_status_change_dto import ShipmentStatusChangeDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ShipmentStatusChangeDTO from a JSON string
shipment_status_change_dto_instance = ShipmentStatusChangeDTO.from_json(json)
# print the JSON string representation of the object
print(ShipmentStatusChangeDTO.to_json())

# convert the object into a dict
shipment_status_change_dto_dict = shipment_status_change_dto_instance.to_dict()
# create an instance of ShipmentStatusChangeDTO from a dict
shipment_status_change_dto_from_dict = ShipmentStatusChangeDTO.from_dict(shipment_status_change_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


