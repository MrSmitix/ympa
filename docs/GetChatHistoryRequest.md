# GetChatHistoryRequest

Историю какого чата нужно получить — и начиная с какого сообщения. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_id_from** | **int** | Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_chat_history_request import GetChatHistoryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetChatHistoryRequest from a JSON string
get_chat_history_request_instance = GetChatHistoryRequest.from_json(json)
# print the JSON string representation of the object
print GetChatHistoryRequest.to_json()

# convert the object into a dict
get_chat_history_request_dict = get_chat_history_request_instance.to_dict()
# create an instance of GetChatHistoryRequest from a dict
get_chat_history_request_from_dict = GetChatHistoryRequest.from_dict(get_chat_history_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


