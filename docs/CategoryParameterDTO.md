

# CategoryParameterDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Идентификатор характеристики. | 
**name** | **String** | Название характеристики. |  [optional]
**type** | [**ParameterType**](ParameterType.md) |  | 
**unit** | [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  |  [optional]
**description** | **String** | Описание характеристики. |  [optional]
**recommendationTypes** | [**List&lt;OfferCardRecommendationType&gt;**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. |  [optional]
**required** | **Boolean** | Обязательность характеристики. | 
**filtering** | **Boolean** | Используется ли характеристика в фильтре. | 
**distinctive** | **Boolean** | Является ли характеристика особенностью варианта. | 
**multivalue** | **Boolean** | Можно ли передать сразу несколько значений. | 
**allowCustomValues** | **Boolean** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**values** | [**List&lt;ParameterValueOptionDTO&gt;**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. |  [optional]
**constraints** | [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  |  [optional]
**valueRestrictions** | [**List&lt;ValueRestrictionDTO&gt;**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. |  [optional]




