# CategoryContentParametersDTO

Информация о параметрах категории.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_id** | **int** | Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). | 
**parameters** | [**List[CategoryParameterDTO]**](CategoryParameterDTO.md) | Список характеристик. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.category_content_parameters_dto import CategoryContentParametersDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CategoryContentParametersDTO from a JSON string
category_content_parameters_dto_instance = CategoryContentParametersDTO.from_json(json)
# print the JSON string representation of the object
print CategoryContentParametersDTO.to_json()

# convert the object into a dict
category_content_parameters_dto_dict = category_content_parameters_dto_instance.to_dict()
# create an instance of CategoryContentParametersDTO from a dict
category_content_parameters_dto_from_dict = CategoryContentParametersDTO.from_dict(category_content_parameters_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


