# openapi.model.CategoryParameterDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор характеристики. | 
**name** | **String** | Название характеристики. | [optional] 
**type** | [**ParameterType**](ParameterType.md) |  | 
**unit** | [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  | [optional] 
**description** | **String** | Описание характеристики. | [optional] 
**recommendationTypes** | [**List<OfferCardRecommendationType>**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] [default to const []]
**required_** | **bool** | Обязательность характеристики. | 
**filtering** | **bool** | Используется ли характеристика в фильтре. | 
**distinctive** | **bool** | Является ли характеристика особенностью варианта. | 
**multivalue** | **bool** | Можно ли передать сразу несколько значений. | 
**allowCustomValues** | **bool** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`. | 
**values** | [**List<ParameterValueOptionDTO>**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа `ENUM`. | [optional] [default to const []]
**constraints** | [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  | [optional] 
**valueRestrictions** | [**List<ValueRestrictionDTO>**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`. | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


