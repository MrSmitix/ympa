# ApiLimitErrorResponse

Превышено ограничение на доступ к ресурсу.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**errors** | [**List[ApiErrorDTO]**](ApiErrorDTO.md) | Список ошибок. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.api_limit_error_response import ApiLimitErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ApiLimitErrorResponse from a JSON string
api_limit_error_response_instance = ApiLimitErrorResponse.from_json(json)
# print the JSON string representation of the object
print ApiLimitErrorResponse.to_json()

# convert the object into a dict
api_limit_error_response_dict = api_limit_error_response_instance.to_dict()
# create an instance of ApiLimitErrorResponse from a dict
api_limit_error_response_from_dict = ApiLimitErrorResponse.from_dict(api_limit_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


