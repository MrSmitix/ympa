

# CategoryParameterDTO

Характеристика товара.

The class is defined in **[CategoryParameterDTO.java](../../src/main/java/org/openapitools/model/CategoryParameterDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор характеристики. | 
**name** | `String` | Название характеристики. |  [optional property]
**type** | `ParameterType` |  | 
**unit** | [`CategoryParameterUnitDTO`](CategoryParameterUnitDTO.md) |  |  [optional property]
**description** | `String` | Описание характеристики. |  [optional property]
**recommendationTypes** | `List&lt;OfferCardRecommendationType&gt;` | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. |  [optional property]
**required** | `Boolean` | Обязательность характеристики. | 
**filtering** | `Boolean` | Используется ли характеристика в фильтре. | 
**distinctive** | `Boolean` | Является ли характеристика особенностью варианта. | 
**multivalue** | `Boolean` | Можно ли передать сразу несколько значений. | 
**allowCustomValues** | `Boolean` | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**values** | [`List&lt;ParameterValueOptionDTO&gt;`](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. |  [optional property]
**constraints** | [`ParameterValueConstraintsDTO`](ParameterValueConstraintsDTO.md) |  |  [optional property]
**valueRestrictions** | [`List&lt;ValueRestrictionDTO&gt;`](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. |  [optional property]
















