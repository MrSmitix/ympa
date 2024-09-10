# ParameterValueDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parameterId** | **Int64** | Идентификатор характеристики. | 
**unitId** | **Int64** | Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию. | [optional] 
**valueId** | **Int64** | Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;.  | [optional] 
**value** | **String** | Значение. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


