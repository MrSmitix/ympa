# GetShipmentResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**ShipmentDTO**](ShipmentDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_shipment_response import GetShipmentResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetShipmentResponse from a JSON string
get_shipment_response_instance = GetShipmentResponse.from_json(json)
# print the JSON string representation of the object
print(GetShipmentResponse.to_json())

# convert the object into a dict
get_shipment_response_dict = get_shipment_response_instance.to_dict()
# create an instance of GetShipmentResponse from a dict
get_shipment_response_from_dict = GetShipmentResponse.from_dict(get_shipment_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


