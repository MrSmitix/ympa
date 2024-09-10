# ChatMessagesResultDTO

Информация о сообщениях.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_id** | **int** | Идентификатор заказа. | 
**messages** | [**List[ChatMessageDTO]**](ChatMessageDTO.md) | Информация о сообщениях. | 
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.chat_messages_result_dto import ChatMessagesResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ChatMessagesResultDTO from a JSON string
chat_messages_result_dto_instance = ChatMessagesResultDTO.from_json(json)
# print the JSON string representation of the object
print(ChatMessagesResultDTO.to_json())

# convert the object into a dict
chat_messages_result_dto_dict = chat_messages_result_dto_instance.to_dict()
# create an instance of ChatMessagesResultDTO from a dict
chat_messages_result_dto_from_dict = ChatMessagesResultDTO.from_dict(chat_messages_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


