# GetReturnsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**PagedReturnsDTO**](PagedReturnsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_returns_response import GetReturnsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetReturnsResponse from a JSON string
get_returns_response_instance = GetReturnsResponse.from_json(json)
# print the JSON string representation of the object
print(GetReturnsResponse.to_json())

# convert the object into a dict
get_returns_response_dict = get_returns_response_instance.to_dict()
# create an instance of GetReturnsResponse from a dict
get_returns_response_from_dict = GetReturnsResponse.from_dict(get_returns_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


