# CreateChatResultDTO

Информация о созданном чате.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chat_id** | **int** | Идентификатор чата. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.create_chat_result_dto import CreateChatResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatResultDTO from a JSON string
create_chat_result_dto_instance = CreateChatResultDTO.from_json(json)
# print the JSON string representation of the object
print CreateChatResultDTO.to_json()

# convert the object into a dict
create_chat_result_dto_dict = create_chat_result_dto_instance.to_dict()
# create an instance of CreateChatResultDTO from a dict
create_chat_result_dto_from_dict = CreateChatResultDTO.from_dict(create_chat_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


