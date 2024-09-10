# GetPromosResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GetPromosResultDTO**](GetPromosResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_promos_response import GetPromosResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromosResponse from a JSON string
get_promos_response_instance = GetPromosResponse.from_json(json)
# print the JSON string representation of the object
print GetPromosResponse.to_json()

# convert the object into a dict
get_promos_response_dict = get_promos_response_instance.to_dict()
# create an instance of GetPromosResponse from a dict
get_promos_response_from_dict = GetPromosResponse.from_dict(get_promos_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


