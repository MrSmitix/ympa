# OpenapiClient::CategoryParameterDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор характеристики. |  |
| **name** | **String** | Название характеристики. | [optional] |
| **type** | [**ParameterType**](ParameterType.md) |  |  |
| **unit** | [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  | [optional] |
| **description** | **String** | Описание характеристики. | [optional] |
| **recommendation_types** | [**Array&lt;OfferCardRecommendationType&gt;**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] |
| **required** | **Boolean** | Обязательность характеристики. |  |
| **filtering** | **Boolean** | Используется ли характеристика в фильтре. |  |
| **distinctive** | **Boolean** | Является ли характеристика особенностью варианта. |  |
| **multivalue** | **Boolean** | Можно ли передать сразу несколько значений. |  |
| **allow_custom_values** | **Boolean** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. |  |
| **values** | [**Array&lt;ParameterValueOptionDTO&gt;**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] |
| **constraints** | [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  | [optional] |
| **value_restrictions** | [**Array&lt;ValueRestrictionDTO&gt;**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CategoryParameterDTO.new(
  id: null,
  name: null,
  type: null,
  unit: null,
  description: null,
  recommendation_types: null,
  required: null,
  filtering: null,
  distinctive: null,
  multivalue: null,
  allow_custom_values: null,
  values: null,
  constraints: null,
  value_restrictions: null
)
```

