# ParameterValueDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ParameterId** | **Int64** | Идентификатор характеристики. | 
**UnitId** | **Int64** | Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию. | [optional] 
**ValueId** | **Int64** | Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;.  | [optional] 
**Value** | **String** | Значение. | [optional] 

## Examples

- Prepare the resource
```powershell
$ParameterValueDTO = Initialize-ympa_powershell_clientParameterValueDTO  -ParameterId null `
 -UnitId null `
 -ValueId null `
 -Value null
```

- Convert the resource to JSON
```powershell
$ParameterValueDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

