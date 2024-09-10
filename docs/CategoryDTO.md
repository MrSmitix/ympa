# CategoryDTO

Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор категории. | 
**name** | **str** | Название категории. | 
**children** | [**List[CategoryDTO]**](CategoryDTO.md) | Дочерние категории. | [optional] 

## Example

```python
from ympa_python_client.models.category_dto import CategoryDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CategoryDTO from a JSON string
category_dto_instance = CategoryDTO.from_json(json)
# print the JSON string representation of the object
print(CategoryDTO.to_json())

# convert the object into a dict
category_dto_dict = category_dto_instance.to_dict()
# create an instance of CategoryDTO from a dict
category_dto_from_dict = CategoryDTO.from_dict(category_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


