# ympa_csharp_client.Model.CategoryParameterDTO
Характеристика товара.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long** | Идентификатор характеристики. | 
**Name** | **string** | Название характеристики. | [optional] 
**Type** | **ParameterType** |  | 
**Unit** | [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  | [optional] 
**Description** | **string** | Описание характеристики. | [optional] 
**RecommendationTypes** | [**List&lt;OfferCardRecommendationType&gt;**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] 
**Required** | **bool** | Обязательность характеристики. | 
**Filtering** | **bool** | Используется ли характеристика в фильтре. | 
**Distinctive** | **bool** | Является ли характеристика особенностью варианта. | 
**Multivalue** | **bool** | Можно ли передать сразу несколько значений. | 
**AllowCustomValues** | **bool** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**Values** | [**List&lt;ParameterValueOptionDTO&gt;**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 
**Constraints** | [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  | [optional] 
**ValueRestrictions** | [**List&lt;ValueRestrictionDTO&gt;**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

