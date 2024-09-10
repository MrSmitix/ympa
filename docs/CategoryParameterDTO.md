# CategoryParameterDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор характеристики. | 
**name** | **String** | Название характеристики. | [optional] 
**type** | [**ParameterType**](ParameterType.md) |  | 
**unit** | [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  | [optional] 
**description** | **String** | Описание характеристики. | [optional] 
**recommendationTypes** | [OfferCardRecommendationType] | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] 
**_required** | **Bool** | Обязательность характеристики. | 
**filtering** | **Bool** | Используется ли характеристика в фильтре. | 
**distinctive** | **Bool** | Является ли характеристика особенностью варианта. | 
**multivalue** | **Bool** | Можно ли передать сразу несколько значений. | 
**allowCustomValues** | **Bool** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**values** | [ParameterValueOptionDTO] | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 
**constraints** | [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  | [optional] 
**valueRestrictions** | [ValueRestrictionDTO] | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


