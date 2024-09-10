# GetChatsInfoDTO

Список чатов.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chats** | [**List[GetChatInfoDTO]**](GetChatInfoDTO.md) | Информация о чатах. | 
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_chats_info_dto import GetChatsInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetChatsInfoDTO from a JSON string
get_chats_info_dto_instance = GetChatsInfoDTO.from_json(json)
# print the JSON string representation of the object
print GetChatsInfoDTO.to_json()

# convert the object into a dict
get_chats_info_dto_dict = get_chats_info_dto_instance.to_dict()
# create an instance of GetChatsInfoDTO from a dict
get_chats_info_dto_from_dict = GetChatsInfoDTO.from_dict(get_chats_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


