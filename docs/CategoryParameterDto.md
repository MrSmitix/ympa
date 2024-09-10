# CategoryParameterDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор характеристики. | 
**name** | Option<**String**> | Название характеристики. | [optional]
**r#type** | [**models::ParameterType**](ParameterType.md) |  | 
**unit** | Option<[**models::CategoryParameterUnitDto**](CategoryParameterUnitDTO.md)> |  | [optional]
**description** | Option<**String**> | Описание характеристики. | [optional]
**recommendation_types** | Option<[**Vec<models::OfferCardRecommendationType>**](OfferCardRecommendationType.md)> | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional]
**required** | **bool** | Обязательность характеристики. | 
**filtering** | **bool** | Используется ли характеристика в фильтре. | 
**distinctive** | **bool** | Является ли характеристика особенностью варианта. | 
**multivalue** | **bool** | Можно ли передать сразу несколько значений. | 
**allow_custom_values** | **bool** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`. | 
**values** | Option<[**Vec<models::ParameterValueOptionDto>**](ParameterValueOptionDTO.md)> | Список допустимых значений параметра. Только для характеристик типа `ENUM`. | [optional]
**constraints** | Option<[**models::ParameterValueConstraintsDto**](ParameterValueConstraintsDTO.md)> |  | [optional]
**value_restrictions** | Option<[**Vec<models::ValueRestrictionDto>**](ValueRestrictionDTO.md)> | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


