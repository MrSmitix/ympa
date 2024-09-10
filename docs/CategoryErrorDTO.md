# CategoryErrorDTO

Текст ошибки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_id** | **int** | Идентификатор категории. | [optional] 
**type** | [**CategoryErrorType**](CategoryErrorType.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.category_error_dto import CategoryErrorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CategoryErrorDTO from a JSON string
category_error_dto_instance = CategoryErrorDTO.from_json(json)
# print the JSON string representation of the object
print(CategoryErrorDTO.to_json())

# convert the object into a dict
category_error_dto_dict = category_error_dto_instance.to_dict()
# create an instance of CategoryErrorDTO from a dict
category_error_dto_from_dict = CategoryErrorDTO.from_dict(category_error_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


