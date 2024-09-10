# SetFeedParamsRequest

Запрос на обновление изменение параметров прайс-листа.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameters** | [**List[FeedParameterDTO]**](FeedParameterDTO.md) | Параметры прайс-листа.  Обязательный параметр.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.set_feed_params_request import SetFeedParamsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SetFeedParamsRequest from a JSON string
set_feed_params_request_instance = SetFeedParamsRequest.from_json(json)
# print the JSON string representation of the object
print SetFeedParamsRequest.to_json()

# convert the object into a dict
set_feed_params_request_dict = set_feed_params_request_instance.to_dict()
# create an instance of SetFeedParamsRequest from a dict
set_feed_params_request_from_dict = SetFeedParamsRequest.from_dict(set_feed_params_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


