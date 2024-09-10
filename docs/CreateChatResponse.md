# CreateChatResponse

Результат создания чата.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**CreateChatResultDTO**](CreateChatResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.create_chat_response import CreateChatResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatResponse from a JSON string
create_chat_response_instance = CreateChatResponse.from_json(json)
# print the JSON string representation of the object
print CreateChatResponse.to_json()

# convert the object into a dict
create_chat_response_dict = create_chat_response_instance.to_dict()
# create an instance of CreateChatResponse from a dict
create_chat_response_from_dict = CreateChatResponse.from_dict(create_chat_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


