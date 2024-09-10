# ApiNotFoundErrorResponse

Запрашиваемый ресурс не найден.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**errors** | [**List[ApiErrorDTO]**](ApiErrorDTO.md) | Список ошибок. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.api_not_found_error_response import ApiNotFoundErrorResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ApiNotFoundErrorResponse from a JSON string
api_not_found_error_response_instance = ApiNotFoundErrorResponse.from_json(json)
# print the JSON string representation of the object
print ApiNotFoundErrorResponse.to_json()

# convert the object into a dict
api_not_found_error_response_dict = api_not_found_error_response_instance.to_dict()
# create an instance of ApiNotFoundErrorResponse from a dict
api_not_found_error_response_from_dict = ApiNotFoundErrorResponse.from_dict(api_not_found_error_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


