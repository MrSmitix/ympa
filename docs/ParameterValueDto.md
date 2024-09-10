# ParameterValueDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter_id** | **i64** | Идентификатор характеристики. | 
**unit_id** | Option<**i64**> | Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию. | [optional]
**value_id** | Option<**i64**> | Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`.  | [optional]
**value** | Option<**String**> | Значение. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


