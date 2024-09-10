# GetCategoriesMaxSaleQuantumResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**results** | [**List[MaxSaleQuantumDTO]**](MaxSaleQuantumDTO.md) | Категории и лимит на установку кванта и минимального количества товаров. | 
**errors** | [**List[CategoryErrorDTO]**](CategoryErrorDTO.md) | Ошибки, которые появились из-за переданных категорий. | [optional] 

## Example

```python
from ympa_python_client.models.get_categories_max_sale_quantum_response import GetCategoriesMaxSaleQuantumResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetCategoriesMaxSaleQuantumResponse from a JSON string
get_categories_max_sale_quantum_response_instance = GetCategoriesMaxSaleQuantumResponse.from_json(json)
# print the JSON string representation of the object
print(GetCategoriesMaxSaleQuantumResponse.to_json())

# convert the object into a dict
get_categories_max_sale_quantum_response_dict = get_categories_max_sale_quantum_response_instance.to_dict()
# create an instance of GetCategoriesMaxSaleQuantumResponse from a dict
get_categories_max_sale_quantum_response_from_dict = GetCategoriesMaxSaleQuantumResponse.from_dict(get_categories_max_sale_quantum_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


