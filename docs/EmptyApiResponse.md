# EmptyApiResponse

Пустой ответ сервера.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.empty_api_response import EmptyApiResponse

# TODO update the JSON string below
json = "{}"
# create an instance of EmptyApiResponse from a JSON string
empty_api_response_instance = EmptyApiResponse.from_json(json)
# print the JSON string representation of the object
print EmptyApiResponse.to_json()

# convert the object into a dict
empty_api_response_dict = empty_api_response_instance.to_dict()
# create an instance of EmptyApiResponse from a dict
empty_api_response_from_dict = EmptyApiResponse.from_dict(empty_api_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


