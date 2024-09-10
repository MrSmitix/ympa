# GetWarehousesResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**WarehousesDTO**](WarehousesDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_warehouses_response import GetWarehousesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetWarehousesResponse from a JSON string
get_warehouses_response_instance = GetWarehousesResponse.from_json(json)
# print the JSON string representation of the object
print GetWarehousesResponse.to_json()

# convert the object into a dict
get_warehouses_response_dict = get_warehouses_response_instance.to_dict()
# create an instance of GetWarehousesResponse from a dict
get_warehouses_response_from_dict = GetWarehousesResponse.from_dict(get_warehouses_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


