# TariffDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**TariffType**](TariffType.md) |  | 
**Percent** | **Decimal** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  | [optional] 
**Amount** | **Decimal** | Значение тарифа в рублях. | 
**Parameters** | [**TariffParameterDTO[]**](TariffParameterDTO.md) | Параметры расчета тарифа. | 

## Examples

- Prepare the resource
```powershell
$TariffDTO = Initialize-ympa_powershell_clientTariffDTO  -Type null `
 -Percent null `
 -Amount null `
 -Parameters null
```

- Convert the resource to JSON
```powershell
$TariffDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

