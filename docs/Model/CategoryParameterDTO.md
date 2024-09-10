# CategoryParameterDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор характеристики. | 
**name** | **string** | Название характеристики. | [optional] 
**type** | [**OpenAPI\Server\Model\ParameterType**](ParameterType.md) |  | 
**unit** | [**OpenAPI\Server\Model\CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  | [optional] 
**description** | **string** | Описание характеристики. | [optional] 
**recommendationTypes** | [**OpenAPI\Server\Model\OfferCardRecommendationType**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] 
**required** | **bool** | Обязательность характеристики. | 
**filtering** | **bool** | Используется ли характеристика в фильтре. | 
**distinctive** | **bool** | Является ли характеристика особенностью варианта. | 
**multivalue** | **bool** | Можно ли передать сразу несколько значений. | 
**allowCustomValues** | **bool** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**values** | [**OpenAPI\Server\Model\ParameterValueOptionDTO**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 
**constraints** | [**OpenAPI\Server\Model\ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  | [optional] 
**valueRestrictions** | [**OpenAPI\Server\Model\ValueRestrictionDTO**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


