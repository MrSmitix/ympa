# GetPriceDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **Decimal** | Значение. | 
**CurrencyId** | [**CurrencyType**](CurrencyType.md) |  | 
**UpdatedAt** | **System.DateTime** | Время последнего обновления. | 

## Examples

- Prepare the resource
```powershell
$GetPriceDTO = Initialize-ympa_powershell_clientGetPriceDTO  -Value null `
 -CurrencyId null `
 -UpdatedAt null
```

- Convert the resource to JSON
```powershell
$GetPriceDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

