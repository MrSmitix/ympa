# GetCategoriesMaxSaleQuantumDTO

Категории и лимит на установку кванта и минимального количества товаров.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[MaxSaleQuantumDTO]**](MaxSaleQuantumDTO.md) | Категории и лимит на установку кванта и минимального количества товаров. | 
**errors** | [**List[CategoryErrorDTO]**](CategoryErrorDTO.md) | Ошибки, которые появились из-за переданных категорий. | [optional] 

## Example

```python
from ympa_python_client.models.get_categories_max_sale_quantum_dto import GetCategoriesMaxSaleQuantumDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetCategoriesMaxSaleQuantumDTO from a JSON string
get_categories_max_sale_quantum_dto_instance = GetCategoriesMaxSaleQuantumDTO.from_json(json)
# print the JSON string representation of the object
print(GetCategoriesMaxSaleQuantumDTO.to_json())

# convert the object into a dict
get_categories_max_sale_quantum_dto_dict = get_categories_max_sale_quantum_dto_instance.to_dict()
# create an instance of GetCategoriesMaxSaleQuantumDTO from a dict
get_categories_max_sale_quantum_dto_from_dict = GetCategoriesMaxSaleQuantumDTO.from_dict(get_categories_max_sale_quantum_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


