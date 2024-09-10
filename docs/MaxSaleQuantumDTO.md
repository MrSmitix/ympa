# MaxSaleQuantumDTO

Лимит на установку кванта и минимального количества товаров по категориям. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор категории. | 
**name** | **str** | Название категории. | [optional] 
**max_sale_quantum** | **int** | Лимит на установку кванта и минимального количества товаров. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.max_sale_quantum_dto import MaxSaleQuantumDTO

# TODO update the JSON string below
json = "{}"
# create an instance of MaxSaleQuantumDTO from a JSON string
max_sale_quantum_dto_instance = MaxSaleQuantumDTO.from_json(json)
# print the JSON string representation of the object
print MaxSaleQuantumDTO.to_json()

# convert the object into a dict
max_sale_quantum_dto_dict = max_sale_quantum_dto_instance.to_dict()
# create an instance of MaxSaleQuantumDTO from a dict
max_sale_quantum_dto_from_dict = MaxSaleQuantumDTO.from_dict(max_sale_quantum_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


