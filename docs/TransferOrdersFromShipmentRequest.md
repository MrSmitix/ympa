# TransferOrdersFromShipmentRequest

Запрос переноса заказов из отгрузки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_ids** | **List[int]** | Список заказов, которые вы не успеваете подготовить. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.transfer_orders_from_shipment_request import TransferOrdersFromShipmentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TransferOrdersFromShipmentRequest from a JSON string
transfer_orders_from_shipment_request_instance = TransferOrdersFromShipmentRequest.from_json(json)
# print the JSON string representation of the object
print TransferOrdersFromShipmentRequest.to_json()

# convert the object into a dict
transfer_orders_from_shipment_request_dict = transfer_orders_from_shipment_request_instance.to_dict()
# create an instance of TransferOrdersFromShipmentRequest from a dict
transfer_orders_from_shipment_request_from_dict = TransferOrdersFromShipmentRequest.from_dict(transfer_orders_from_shipment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


