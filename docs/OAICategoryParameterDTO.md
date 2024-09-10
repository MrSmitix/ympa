# OAICategoryParameterDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор характеристики. | 
**name** | **NSString*** | Название характеристики. | [optional] 
**type** | [**OAIParameterType***](OAIParameterType.md) |  | 
**unit** | [**OAICategoryParameterUnitDTO***](OAICategoryParameterUnitDTO.md) |  | [optional] 
**_description** | **NSString*** | Описание характеристики. | [optional] 
**recommendationTypes** | [**NSArray&lt;OAIOfferCardRecommendationType&gt;***](OAIOfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] 
**required** | **NSNumber*** | Обязательность характеристики. | 
**filtering** | **NSNumber*** | Используется ли характеристика в фильтре. | 
**distinctive** | **NSNumber*** | Является ли характеристика особенностью варианта. | 
**multivalue** | **NSNumber*** | Можно ли передать сразу несколько значений. | 
**allowCustomValues** | **NSNumber*** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**values** | [**NSArray&lt;OAIParameterValueOptionDTO&gt;***](OAIParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 
**constraints** | [**OAIParameterValueConstraintsDTO***](OAIParameterValueConstraintsDTO.md) |  | [optional] 
**valueRestrictions** | [**NSArray&lt;OAIValueRestrictionDTO&gt;***](OAIValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


