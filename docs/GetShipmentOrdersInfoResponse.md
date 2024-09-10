# GetShipmentOrdersInfoResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OrdersShipmentInfoDTO**](OrdersShipmentInfoDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_shipment_orders_info_response import GetShipmentOrdersInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetShipmentOrdersInfoResponse from a JSON string
get_shipment_orders_info_response_instance = GetShipmentOrdersInfoResponse.from_json(json)
# print the JSON string representation of the object
print(GetShipmentOrdersInfoResponse.to_json())

# convert the object into a dict
get_shipment_orders_info_response_dict = get_shipment_orders_info_response_instance.to_dict()
# create an instance of GetShipmentOrdersInfoResponse from a dict
get_shipment_orders_info_response_from_dict = GetShipmentOrdersInfoResponse.from_dict(get_shipment_orders_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


