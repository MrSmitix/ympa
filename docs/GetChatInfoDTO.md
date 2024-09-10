# GetChatInfoDTO

Информация о чатах.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chat_id** | **int** | Идентификатор чата. | 
**order_id** | **int** | Идентификатор заказа. | 
**type** | [**ChatType**](ChatType.md) |  | 
**status** | [**ChatStatusType**](ChatStatusType.md) |  | 
**created_at** | **datetime** | Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**updated_at** | **datetime** | Дата и время последнего сообщения в чате. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_chat_info_dto import GetChatInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetChatInfoDTO from a JSON string
get_chat_info_dto_instance = GetChatInfoDTO.from_json(json)
# print the JSON string representation of the object
print GetChatInfoDTO.to_json()

# convert the object into a dict
get_chat_info_dto_dict = get_chat_info_dto_instance.to_dict()
# create an instance of GetChatInfoDTO from a dict
get_chat_info_dto_from_dict = GetChatInfoDTO.from_dict(get_chat_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


