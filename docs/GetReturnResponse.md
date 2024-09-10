# GetReturnResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**ReturnDTO**](ReturnDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_return_response import GetReturnResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetReturnResponse from a JSON string
get_return_response_instance = GetReturnResponse.from_json(json)
# print the JSON string representation of the object
print(GetReturnResponse.to_json())

# convert the object into a dict
get_return_response_dict = get_return_response_instance.to_dict()
# create an instance of GetReturnResponse from a dict
get_return_response_from_dict = GetReturnResponse.from_dict(get_return_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


