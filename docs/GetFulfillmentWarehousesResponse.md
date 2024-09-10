# GetFulfillmentWarehousesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**FulfillmentWarehousesDTO**](FulfillmentWarehousesDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_fulfillment_warehouses_response import GetFulfillmentWarehousesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetFulfillmentWarehousesResponse from a JSON string
get_fulfillment_warehouses_response_instance = GetFulfillmentWarehousesResponse.from_json(json)
# print the JSON string representation of the object
print(GetFulfillmentWarehousesResponse.to_json())

# convert the object into a dict
get_fulfillment_warehouses_response_dict = get_fulfillment_warehouses_response_instance.to_dict()
# create an instance of GetFulfillmentWarehousesResponse from a dict
get_fulfillment_warehouses_response_from_dict = GetFulfillmentWarehousesResponse.from_dict(get_fulfillment_warehouses_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


