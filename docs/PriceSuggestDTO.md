# PriceSuggestDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**PriceSuggestType**](PriceSuggestType.md) |  | [optional] 
**Price** | **Decimal** | Цена в рублях. | [optional] 

## Examples

- Prepare the resource
```powershell
$PriceSuggestDTO = Initialize-ympa_powershell_clientPriceSuggestDTO  -Type null `
 -Price null
```

- Convert the resource to JSON
```powershell
$PriceSuggestDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

