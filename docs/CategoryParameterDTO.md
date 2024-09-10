# ympa_r_client::CategoryParameterDTO

Характеристика товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор характеристики. | 
**name** | **character** | Название характеристики. | [optional] 
**type** | [**ParameterType**](ParameterType.md) |  | [Enum: ] 
**unit** | [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  | [optional] 
**description** | **character** | Описание характеристики. | [optional] 
**recommendationTypes** | [**array[OfferCardRecommendationType]**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] 
**required** | **character** | Обязательность характеристики. | 
**filtering** | **character** | Используется ли характеристика в фильтре. | 
**distinctive** | **character** | Является ли характеристика особенностью варианта. | 
**multivalue** | **character** | Можно ли передать сразу несколько значений. | 
**allowCustomValues** | **character** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**values** | [**array[ParameterValueOptionDTO]**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 
**constraints** | [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  | [optional] 
**valueRestrictions** | [**array[ValueRestrictionDTO]**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 


