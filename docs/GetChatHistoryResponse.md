# GetChatHistoryResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**ChatMessagesResultDTO**](ChatMessagesResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_chat_history_response import GetChatHistoryResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetChatHistoryResponse from a JSON string
get_chat_history_response_instance = GetChatHistoryResponse.from_json(json)
# print the JSON string representation of the object
print(GetChatHistoryResponse.to_json())

# convert the object into a dict
get_chat_history_response_dict = get_chat_history_response_instance.to_dict()
# create an instance of GetChatHistoryResponse from a dict
get_chat_history_response_from_dict = GetChatHistoryResponse.from_dict(get_chat_history_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


