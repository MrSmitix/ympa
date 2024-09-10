# GetCategoriesMaxSaleQuantumRequest

Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market_category_ids** | **List[int]** | Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_categories_max_sale_quantum_request import GetCategoriesMaxSaleQuantumRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetCategoriesMaxSaleQuantumRequest from a JSON string
get_categories_max_sale_quantum_request_instance = GetCategoriesMaxSaleQuantumRequest.from_json(json)
# print the JSON string representation of the object
print GetCategoriesMaxSaleQuantumRequest.to_json()

# convert the object into a dict
get_categories_max_sale_quantum_request_dict = get_categories_max_sale_quantum_request_instance.to_dict()
# create an instance of GetCategoriesMaxSaleQuantumRequest from a dict
get_categories_max_sale_quantum_request_from_dict = GetCategoriesMaxSaleQuantumRequest.from_dict(get_categories_max_sale_quantum_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


