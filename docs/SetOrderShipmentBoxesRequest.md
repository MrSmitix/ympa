# SetOrderShipmentBoxesRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boxes** | [**List[ParcelBoxDTO]**](ParcelBoxDTO.md) | Список грузовых мест. Маркет определяет количество мест по длине этого списка. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.set_order_shipment_boxes_request import SetOrderShipmentBoxesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SetOrderShipmentBoxesRequest from a JSON string
set_order_shipment_boxes_request_instance = SetOrderShipmentBoxesRequest.from_json(json)
# print the JSON string representation of the object
print SetOrderShipmentBoxesRequest.to_json()

# convert the object into a dict
set_order_shipment_boxes_request_dict = set_order_shipment_boxes_request_instance.to_dict()
# create an instance of SetOrderShipmentBoxesRequest from a dict
set_order_shipment_boxes_request_from_dict = SetOrderShipmentBoxesRequest.from_dict(set_order_shipment_boxes_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


