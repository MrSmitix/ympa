# QuantumDTO

Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр `quantum`.  {% cut \"Пример\" %}  ```json {   \"offers\": [     {       \"offerId\": \"08e35dc1-89a2-11e3-8055-0015e9b8c48d\",       \"quantum\": {}     }   ] } ```  {% endcut %} 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_quantity** | **int** | Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать.  | [optional] 
**step_quantity** | **int** | На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.quantum_dto import QuantumDTO

# TODO update the JSON string below
json = "{}"
# create an instance of QuantumDTO from a JSON string
quantum_dto_instance = QuantumDTO.from_json(json)
# print the JSON string representation of the object
print QuantumDTO.to_json()

# convert the object into a dict
quantum_dto_dict = quantum_dto_instance.to_dict()
# create an instance of QuantumDTO from a dict
quantum_dto_from_dict = QuantumDTO.from_dict(quantum_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


