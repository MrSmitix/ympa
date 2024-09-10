
# CategoryParameterDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Long** | Идентификатор характеристики. |  |
| **type** | [**ParameterType**](ParameterType.md) |  |  |
| **required** | **kotlin.Boolean** | Обязательность характеристики. |  |
| **filtering** | **kotlin.Boolean** | Используется ли характеристика в фильтре. |  |
| **distinctive** | **kotlin.Boolean** | Является ли характеристика особенностью варианта. |  |
| **multivalue** | **kotlin.Boolean** | Можно ли передать сразу несколько значений. |  |
| **allowCustomValues** | **kotlin.Boolean** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. |  |
| **name** | **kotlin.String** | Название характеристики. |  [optional] |
| **unit** | [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  |  [optional] |
| **description** | **kotlin.String** | Описание характеристики. |  [optional] |
| **recommendationTypes** | [**kotlin.collections.List&lt;OfferCardRecommendationType&gt;**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. |  [optional] |
| **propertyValues** | [**kotlin.collections.List&lt;ParameterValueOptionDTO&gt;**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. |  [optional] |
| **constraints** | [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  |  [optional] |
| **valueRestrictions** | [**kotlin.collections.List&lt;ValueRestrictionDTO&gt;**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. |  [optional] |



