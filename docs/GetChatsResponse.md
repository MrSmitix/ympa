# GetChatsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GetChatsInfoDTO**](GetChatsInfoDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_chats_response import GetChatsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetChatsResponse from a JSON string
get_chats_response_instance = GetChatsResponse.from_json(json)
# print the JSON string representation of the object
print GetChatsResponse.to_json()

# convert the object into a dict
get_chats_response_dict = get_chats_response_instance.to_dict()
# create an instance of GetChatsResponse from a dict
get_chats_response_from_dict = GetChatsResponse.from_dict(get_chats_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


