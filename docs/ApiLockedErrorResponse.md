# ApiLockedErrorResponse

Ресурс из запроса заблокирован от применения к нему указанного метода.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**errors** | [**List[ApiErrorDTO]**](ApiErrorDTO.md) | Список ошибок. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.api_locked_error_response import ApiLockedErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ApiLockedErrorResponse from a JSON string
api_locked_error_response_instance = ApiLockedErrorResponse.from_json(json)
# print the JSON string representation of the object
print ApiLockedErrorResponse.to_json()

# convert the object into a dict
api_locked_error_response_dict = api_locked_error_response_instance.to_dict()
# create an instance of ApiLockedErrorResponse from a dict
api_locked_error_response_from_dict = ApiLockedErrorResponse.from_dict(api_locked_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


