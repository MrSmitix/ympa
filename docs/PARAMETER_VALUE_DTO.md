# PARAMETER_VALUE_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameter_id** | **INTEGER_64** | Идентификатор характеристики. | [default to null]
**unit_id** | **INTEGER_64** | Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию. | [optional] [default to null]
**value_id** | **INTEGER_64** | Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;.  | [optional] [default to null]
**value** | [**STRING_32**](STRING_32.md) | Значение. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


