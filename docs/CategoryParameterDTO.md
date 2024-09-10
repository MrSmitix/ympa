# CategoryParameterDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор характеристики. | [default to nothing]
**name** | **String** | Название характеристики. | [optional] [default to nothing]
**type** | [***ParameterType**](ParameterType.md) |  | [default to nothing]
**unit** | [***CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  | [optional] [default to nothing]
**description** | **String** | Описание характеристики. | [optional] [default to nothing]
**recommendationTypes** | [**Vector{OfferCardRecommendationType}**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] [default to nothing]
**required** | **Bool** | Обязательность характеристики. | [default to nothing]
**filtering** | **Bool** | Используется ли характеристика в фильтре. | [default to nothing]
**distinctive** | **Bool** | Является ли характеристика особенностью варианта. | [default to nothing]
**multivalue** | **Bool** | Можно ли передать сразу несколько значений. | [default to nothing]
**allowCustomValues** | **Bool** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | [default to nothing]
**values** | [**Vector{ParameterValueOptionDTO}**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] [default to nothing]
**constraints** | [***ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  | [optional] [default to nothing]
**valueRestrictions** | [**Vector{ValueRestrictionDTO}**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


