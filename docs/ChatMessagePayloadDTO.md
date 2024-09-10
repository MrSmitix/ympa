# ChatMessagePayloadDTO

Информация о приложенных к сообщению файлах.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Имя файла. | 
**url** | **str** | Ссылка для скачивания файла. | 
**size** | **int** | Размер файла в байтах. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.chat_message_payload_dto import ChatMessagePayloadDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ChatMessagePayloadDTO from a JSON string
chat_message_payload_dto_instance = ChatMessagePayloadDTO.from_json(json)
# print the JSON string representation of the object
print ChatMessagePayloadDTO.to_json()

# convert the object into a dict
chat_message_payload_dto_dict = chat_message_payload_dto_instance.to_dict()
# create an instance of ChatMessagePayloadDTO from a dict
chat_message_payload_dto_from_dict = ChatMessagePayloadDTO.from_dict(chat_message_payload_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


