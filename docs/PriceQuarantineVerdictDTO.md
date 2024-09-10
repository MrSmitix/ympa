# PriceQuarantineVerdictDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**PriceQuarantineVerdictType**](PriceQuarantineVerdictType.md) |  | [optional] 
**Params** | [**PriceQuarantineVerdictParameterDTO[]**](PriceQuarantineVerdictParameterDTO.md) | Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. | 

## Examples

- Prepare the resource
```powershell
$PriceQuarantineVerdictDTO = Initialize-ympa_powershell_clientPriceQuarantineVerdictDTO  -Type null `
 -Params null
```

- Convert the resource to JSON
```powershell
$PriceQuarantineVerdictDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

