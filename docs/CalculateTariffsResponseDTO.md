# CalculateTariffsResponseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**CalculateTariffsOfferInfoDTO[]**](CalculateTariffsOfferInfoDTO.md) | Стоимость услуг. | 

## Examples

- Prepare the resource
```powershell
$CalculateTariffsResponseDTO = Initialize-ympa_powershell_clientCalculateTariffsResponseDTO  -Offers null
```

- Convert the resource to JSON
```powershell
$CalculateTariffsResponseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

