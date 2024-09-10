# ValueRestrictionDTO

Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limiting_parameter_id** | **int** | Идентификатор ограничивающей характеристики. | 
**limited_values** | [**List[OptionValuesLimitedDTO]**](OptionValuesLimitedDTO.md) | Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.value_restriction_dto import ValueRestrictionDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ValueRestrictionDTO from a JSON string
value_restriction_dto_instance = ValueRestrictionDTO.from_json(json)
# print the JSON string representation of the object
print ValueRestrictionDTO.to_json()

# convert the object into a dict
value_restriction_dto_dict = value_restriction_dto_instance.to_dict()
# create an instance of ValueRestrictionDTO from a dict
value_restriction_dto_from_dict = ValueRestrictionDTO.from_dict(value_restriction_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


