# ApiErrorDTO

Общий формат ошибки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Код ошибки. | 
**message** | **str** | Описание ошибки. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.api_error_dto import ApiErrorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ApiErrorDTO from a JSON string
api_error_dto_instance = ApiErrorDTO.from_json(json)
# print the JSON string representation of the object
print ApiErrorDTO.to_json()

# convert the object into a dict
api_error_dto_dict = api_error_dto_instance.to_dict()
# create an instance of ApiErrorDTO from a dict
api_error_dto_from_dict = ApiErrorDTO.from_dict(api_error_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


