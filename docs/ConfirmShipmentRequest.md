# ConfirmShipmentRequest

Запрос для подтверждения отгрузки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_shipment_id** | **str** | Идентификатор отгрузки в системе поставщика. | [optional] 

## Example

```python
from ympa_python_client.models.confirm_shipment_request import ConfirmShipmentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ConfirmShipmentRequest from a JSON string
confirm_shipment_request_instance = ConfirmShipmentRequest.from_json(json)
# print the JSON string representation of the object
print(ConfirmShipmentRequest.to_json())

# convert the object into a dict
confirm_shipment_request_dict = confirm_shipment_request_instance.to_dict()
# create an instance of ConfirmShipmentRequest from a dict
confirm_shipment_request_from_dict = ConfirmShipmentRequest.from_dict(confirm_shipment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


