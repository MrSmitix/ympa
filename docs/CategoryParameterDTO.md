# WWW::OpenAPIClient::Object::CategoryParameterDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CategoryParameterDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор характеристики. | 
**name** | **string** | Название характеристики. | [optional] 
**type** | [**ParameterType**](ParameterType.md) |  | 
**unit** | [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  | [optional] 
**description** | **string** | Описание характеристики. | [optional] 
**recommendation_types** | [**ARRAY[OfferCardRecommendationType]**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] 
**required** | **boolean** | Обязательность характеристики. | 
**filtering** | **boolean** | Используется ли характеристика в фильтре. | 
**distinctive** | **boolean** | Является ли характеристика особенностью варианта. | 
**multivalue** | **boolean** | Можно ли передать сразу несколько значений. | 
**allow_custom_values** | **boolean** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**values** | [**ARRAY[ParameterValueOptionDTO]**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 
**constraints** | [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  | [optional] 
**value_restrictions** | [**ARRAY[ValueRestrictionDTO]**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


