# GetChatsRequest

Фильтры по чатам, которые нужно вернуть. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_ids** | **List[int]** | Фильтр по идентификаторам заказов на Маркете. | [optional] 
**types** | [**List[ChatType]**](ChatType.md) | Фильтр по типам чатов. | [optional] 
**statuses** | [**List[ChatStatusType]**](ChatStatusType.md) | Фильтр по статусам чатов. | [optional] 

## Example

```python
from ympa_python_client.models.get_chats_request import GetChatsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetChatsRequest from a JSON string
get_chats_request_instance = GetChatsRequest.from_json(json)
# print the JSON string representation of the object
print(GetChatsRequest.to_json())

# convert the object into a dict
get_chats_request_dict = get_chats_request_instance.to_dict()
# create an instance of GetChatsRequest from a dict
get_chats_request_from_dict = GetChatsRequest.from_dict(get_chats_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


