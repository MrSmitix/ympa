# CalculatedTariffDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**CalculatedTariffType**](CalculatedTariffType.md) |  | 
**Amount** | **Decimal** | Стоимость услуги в рублях. | [optional] 
**Parameters** | [**TariffParameterDTO[]**](TariffParameterDTO.md) | Параметры расчета тарифа. | 

## Examples

- Prepare the resource
```powershell
$CalculatedTariffDTO = Initialize-ympa_powershell_clientCalculatedTariffDTO  -Type null `
 -Amount null `
 -Parameters null
```

- Convert the resource to JSON
```powershell
$CalculatedTariffDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

