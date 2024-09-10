# BasePriceDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **Decimal** | Значение. | 
**CurrencyId** | [**CurrencyType**](CurrencyType.md) |  | 

## Examples

- Prepare the resource
```powershell
$BasePriceDTO = Initialize-ympa_powershell_clientBasePriceDTO  -Value null `
 -CurrencyId null
```

- Convert the resource to JSON
```powershell
$BasePriceDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

