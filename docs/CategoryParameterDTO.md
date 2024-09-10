# CategoryParameterDTO

Характеристика товара.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор характеристики. | 
**name** | **str** | Название характеристики. | [optional] 
**type** | [**ParameterType**](ParameterType.md) |  | 
**unit** | [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  | [optional] 
**description** | **str** | Описание характеристики. | [optional] 
**recommendation_types** | [**List[OfferCardRecommendationType]**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] 
**required** | **bool** | Обязательность характеристики. | 
**filtering** | **bool** | Используется ли характеристика в фильтре. | 
**distinctive** | **bool** | Является ли характеристика особенностью варианта. | 
**multivalue** | **bool** | Можно ли передать сразу несколько значений. | 
**allow_custom_values** | **bool** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**values** | [**List[ParameterValueOptionDTO]**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 
**constraints** | [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  | [optional] 
**value_restrictions** | [**List[ValueRestrictionDTO]**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 

## Example

```python
from ympa_python_client.models.category_parameter_dto import CategoryParameterDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CategoryParameterDTO from a JSON string
category_parameter_dto_instance = CategoryParameterDTO.from_json(json)
# print the JSON string representation of the object
print(CategoryParameterDTO.to_json())

# convert the object into a dict
category_parameter_dto_dict = category_parameter_dto_instance.to_dict()
# create an instance of CategoryParameterDTO from a dict
category_parameter_dto_from_dict = CategoryParameterDTO.from_dict(category_parameter_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


