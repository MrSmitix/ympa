# CalculateTariffsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Parameters** | [**CalculateTariffsParametersDTO**](CalculateTariffsParametersDTO.md) |  | 
**Offers** | [**CalculateTariffsOfferDTO[]**](CalculateTariffsOfferDTO.md) | Товары, для которых нужно рассчитать стоимость услуг. | 

## Examples

- Prepare the resource
```powershell
$CalculateTariffsRequest = Initialize-ympa_powershell_clientCalculateTariffsRequest  -Parameters null `
 -Offers null
```

- Convert the resource to JSON
```powershell
$CalculateTariffsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

