# SendMessageToChatRequest

В какой чат нужно отправить сообщение и текст сообщения.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Текст сообщения. Максимальная длина — 4096 символа. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.send_message_to_chat_request import SendMessageToChatRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SendMessageToChatRequest from a JSON string
send_message_to_chat_request_instance = SendMessageToChatRequest.from_json(json)
# print the JSON string representation of the object
print SendMessageToChatRequest.to_json()

# convert the object into a dict
send_message_to_chat_request_dict = send_message_to_chat_request_instance.to_dict()
# create an instance of SendMessageToChatRequest from a dict
send_message_to_chat_request_from_dict = SendMessageToChatRequest.from_dict(send_message_to_chat_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


