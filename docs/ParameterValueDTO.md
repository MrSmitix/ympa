# ParameterValueDTO

Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter_id** | **int** | Идентификатор характеристики. | 
**unit_id** | **int** | Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию. | [optional] 
**value_id** | **int** | Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;.  | [optional] 
**value** | **str** | Значение. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.parameter_value_dto import ParameterValueDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ParameterValueDTO from a JSON string
parameter_value_dto_instance = ParameterValueDTO.from_json(json)
# print the JSON string representation of the object
print ParameterValueDTO.to_json()

# convert the object into a dict
parameter_value_dto_dict = parameter_value_dto_instance.to_dict()
# create an instance of ParameterValueDTO from a dict
parameter_value_dto_from_dict = ParameterValueDTO.from_dict(parameter_value_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


