# ChatMessageDTO

Информация о сообщениях.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_id** | **int** | Идентификатор сообщения. | 
**created_at** | **datetime** | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**sender** | [**ChatMessageSenderType**](ChatMessageSenderType.md) |  | 
**message** | **str** | Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.  | [optional] 
**payload** | [**List[ChatMessagePayloadDTO]**](ChatMessagePayloadDTO.md) | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.chat_message_dto import ChatMessageDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ChatMessageDTO from a JSON string
chat_message_dto_instance = ChatMessageDTO.from_json(json)
# print the JSON string representation of the object
print(ChatMessageDTO.to_json())

# convert the object into a dict
chat_message_dto_dict = chat_message_dto_instance.to_dict()
# create an instance of ChatMessageDTO from a dict
chat_message_dto_from_dict = ChatMessageDTO.from_dict(chat_message_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


