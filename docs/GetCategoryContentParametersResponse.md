# GetCategoryContentParametersResponse

Ответ со списком характеристик для категории и их допустимыми значениями.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**CategoryContentParametersDTO**](CategoryContentParametersDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_category_content_parameters_response import GetCategoryContentParametersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetCategoryContentParametersResponse from a JSON string
get_category_content_parameters_response_instance = GetCategoryContentParametersResponse.from_json(json)
# print the JSON string representation of the object
print(GetCategoryContentParametersResponse.to_json())

# convert the object into a dict
get_category_content_parameters_response_dict = get_category_content_parameters_response_instance.to_dict()
# create an instance of GetCategoryContentParametersResponse from a dict
get_category_content_parameters_response_from_dict = GetCategoryContentParametersResponse.from_dict(get_category_content_parameters_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


