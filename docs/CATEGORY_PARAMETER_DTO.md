# CATEGORY_PARAMETER_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор характеристики. | [default to null]
**name** | [**STRING_32**](STRING_32.md) | Название характеристики. | [optional] [default to null]
**type** | [**PARAMETER_TYPE**](ParameterType.md) |  | [default to null]
**unit** | [**CATEGORY_PARAMETER_UNIT_DTO**](CategoryParameterUnitDTO.md) |  | [optional] [default to null]
**description** | [**STRING_32**](STRING_32.md) | Описание характеристики. | [optional] [default to null]
**recommendation_types** | [**LIST [OFFER_CARD_RECOMMENDATION_TYPE]**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] [default to null]
**required** | **BOOLEAN** | Обязательность характеристики. | [default to null]
**filtering** | **BOOLEAN** | Используется ли характеристика в фильтре. | [default to null]
**distinctive** | **BOOLEAN** | Является ли характеристика особенностью варианта. | [default to null]
**multivalue** | **BOOLEAN** | Можно ли передать сразу несколько значений. | [default to null]
**allow_custom_values** | **BOOLEAN** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | [default to null]
**values** | [**LIST [PARAMETER_VALUE_OPTION_DTO]**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] [default to null]
**constraints** | [**PARAMETER_VALUE_CONSTRAINTS_DTO**](ParameterValueConstraintsDTO.md) |  | [optional] [default to null]
**value_restrictions** | [**LIST [VALUE_RESTRICTION_DTO]**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


