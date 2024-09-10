# ApiForbiddenErrorResponse

Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**errors** | [**List[ApiErrorDTO]**](ApiErrorDTO.md) | Список ошибок. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.api_forbidden_error_response import ApiForbiddenErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ApiForbiddenErrorResponse from a JSON string
api_forbidden_error_response_instance = ApiForbiddenErrorResponse.from_json(json)
# print the JSON string representation of the object
print ApiForbiddenErrorResponse.to_json()

# convert the object into a dict
api_forbidden_error_response_dict = api_forbidden_error_response_instance.to_dict()
# create an instance of ApiForbiddenErrorResponse from a dict
api_forbidden_error_response_from_dict = ApiForbiddenErrorResponse.from_dict(api_forbidden_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


