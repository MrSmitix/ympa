# CategoryParameterDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | Идентификатор характеристики. | [default to null]
**name** | **String!** | Название характеристики. | [optional] [default to null]
**Type_** | [***ParameterType**](ParameterType.md) |  | [default to null]
**unit** | [***CategoryParameterUnitDto**](CategoryParameterUnitDTO.md) |  | [optional] [default to null]
**description** | **String!** | Описание характеристики. | [optional] [default to null]
**recommendationTypes** | [**OfferCardRecommendationType**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] [default to null]
**required** | **Boolean!** | Обязательность характеристики. | [default to null]
**filtering** | **Boolean!** | Используется ли характеристика в фильтре. | [default to null]
**distinctive** | **Boolean!** | Является ли характеристика особенностью варианта. | [default to null]
**multivalue** | **Boolean!** | Можно ли передать сразу несколько значений. | [default to null]
**allowCustomValues** | **Boolean!** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | [default to null]
**values** | [**ParameterValueOptionDto**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] [default to null]
**constraints** | [***ParameterValueConstraintsDto**](ParameterValueConstraintsDTO.md) |  | [optional] [default to null]
**valueRestrictions** | [**ValueRestrictionDto**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


