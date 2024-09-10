# SetOrderShipmentBoxesResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**ShipmentBoxesDTO**](ShipmentBoxesDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.set_order_shipment_boxes_response import SetOrderShipmentBoxesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SetOrderShipmentBoxesResponse from a JSON string
set_order_shipment_boxes_response_instance = SetOrderShipmentBoxesResponse.from_json(json)
# print the JSON string representation of the object
print SetOrderShipmentBoxesResponse.to_json()

# convert the object into a dict
set_order_shipment_boxes_response_dict = set_order_shipment_boxes_response_instance.to_dict()
# create an instance of SetOrderShipmentBoxesResponse from a dict
set_order_shipment_boxes_response_from_dict = SetOrderShipmentBoxesResponse.from_dict(set_order_shipment_boxes_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


