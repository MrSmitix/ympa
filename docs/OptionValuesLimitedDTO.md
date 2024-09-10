# OptionValuesLimitedDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LimitingOptionValueId** | **Int64** | Идентификатор значения ограничивающей характеристики. | 
**OptionValueIds** | **Int64[]** | Идентификаторы допустимых значений ограничиваемой характеристики.  | 

## Examples

- Prepare the resource
```powershell
$OptionValuesLimitedDTO = Initialize-ympa_powershell_clientOptionValuesLimitedDTO  -LimitingOptionValueId null `
 -OptionValueIds null
```

- Convert the resource to JSON
```powershell
$OptionValuesLimitedDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

