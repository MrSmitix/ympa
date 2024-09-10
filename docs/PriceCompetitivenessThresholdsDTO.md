# PriceCompetitivenessThresholdsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OptimalPrice** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**AveragePrice** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PriceCompetitivenessThresholdsDTO = Initialize-ympa_powershell_clientPriceCompetitivenessThresholdsDTO  -OptimalPrice null `
 -AveragePrice null
```

- Convert the resource to JSON
```powershell
$PriceCompetitivenessThresholdsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

