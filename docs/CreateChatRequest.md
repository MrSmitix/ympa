# CreateChatRequest

Заказ, для которого нужно создать чат. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_id** | **int** | Идентификатор заказа на Маркете. | 

## Example

```python
from ympa_python_client.models.create_chat_request import CreateChatRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatRequest from a JSON string
create_chat_request_instance = CreateChatRequest.from_json(json)
# print the JSON string representation of the object
print(CreateChatRequest.to_json())

# convert the object into a dict
create_chat_request_dict = create_chat_request_instance.to_dict()
# create an instance of CreateChatRequest from a dict
create_chat_request_from_dict = CreateChatRequest.from_dict(create_chat_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


