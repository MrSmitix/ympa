# ValueRestrictionDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LimitingParameterId** | **Int64** | Идентификатор ограничивающей характеристики. | 
**LimitedValues** | [**OptionValuesLimitedDTO[]**](OptionValuesLimitedDTO.md) | Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики. | 

## Examples

- Prepare the resource
```powershell
$ValueRestrictionDTO = Initialize-ympa_powershell_clientValueRestrictionDTO  -LimitingParameterId null `
 -LimitedValues null
```

- Convert the resource to JSON
```powershell
$ValueRestrictionDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

