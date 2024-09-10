# ApiServerErrorResponse

Внутренняя ошибка сервера.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**errors** | [**List[ApiErrorDTO]**](ApiErrorDTO.md) | Список ошибок. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.api_server_error_response import ApiServerErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ApiServerErrorResponse from a JSON string
api_server_error_response_instance = ApiServerErrorResponse.from_json(json)
# print the JSON string representation of the object
print ApiServerErrorResponse.to_json()

# convert the object into a dict
api_server_error_response_dict = api_server_error_response_instance.to_dict()
# create an instance of ApiServerErrorResponse from a dict
api_server_error_response_from_dict = ApiServerErrorResponse.from_dict(api_server_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


