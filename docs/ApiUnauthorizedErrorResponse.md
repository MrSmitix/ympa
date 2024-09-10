# ApiUnauthorizedErrorResponse

В запросе не указаны авторизационные данные.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**errors** | [**List[ApiErrorDTO]**](ApiErrorDTO.md) | Список ошибок. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ApiUnauthorizedErrorResponse from a JSON string
api_unauthorized_error_response_instance = ApiUnauthorizedErrorResponse.from_json(json)
# print the JSON string representation of the object
print ApiUnauthorizedErrorResponse.to_json()

# convert the object into a dict
api_unauthorized_error_response_dict = api_unauthorized_error_response_instance.to_dict()
# create an instance of ApiUnauthorizedErrorResponse from a dict
api_unauthorized_error_response_from_dict = ApiUnauthorizedErrorResponse.from_dict(api_unauthorized_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


