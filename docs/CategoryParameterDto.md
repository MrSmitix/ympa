# CategoryParameterDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор характеристики. | 
**name** | **String** | Название характеристики. | [optional] [default to None]
**r#type** | [***models::ParameterType**](ParameterType.md) |  | 
**unit** | [***models::CategoryParameterUnitDto**](CategoryParameterUnitDTO.md) |  | [optional] [default to None]
**description** | **String** | Описание характеристики. | [optional] [default to None]
**recommendation_types** | [**Vec<models::OfferCardRecommendationType>**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] [default to None]
**required** | **bool** | Обязательность характеристики. | 
**filtering** | **bool** | Используется ли характеристика в фильтре. | 
**distinctive** | **bool** | Является ли характеристика особенностью варианта. | 
**multivalue** | **bool** | Можно ли передать сразу несколько значений. | 
**allow_custom_values** | **bool** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`. | 
**values** | [**Vec<models::ParameterValueOptionDto>**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа `ENUM`. | [optional] [default to None]
**constraints** | [***models::ParameterValueConstraintsDto**](ParameterValueConstraintsDTO.md) |  | [optional] [default to None]
**value_restrictions** | [**Vec<models::ValueRestrictionDto>**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


