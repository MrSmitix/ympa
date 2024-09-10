# SetShipmentPalletsCountRequest

Запрос на передачу количества упаковок в отгрузке.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**places_count** | **int** | Количество упаковок в отгрузке. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.set_shipment_pallets_count_request import SetShipmentPalletsCountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SetShipmentPalletsCountRequest from a JSON string
set_shipment_pallets_count_request_instance = SetShipmentPalletsCountRequest.from_json(json)
# print the JSON string representation of the object
print SetShipmentPalletsCountRequest.to_json()

# convert the object into a dict
set_shipment_pallets_count_request_dict = set_shipment_pallets_count_request_instance.to_dict()
# create an instance of SetShipmentPalletsCountRequest from a dict
set_shipment_pallets_count_request_from_dict = SetShipmentPalletsCountRequest.from_dict(set_shipment_pallets_count_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


