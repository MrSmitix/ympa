# TimePeriodDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TimePeriod** | **Int32** | Продолжительность в указанных единицах. | 
**TimeUnit** | [**TimeUnitType**](TimeUnitType.md) |  | 
**Comment** | **String** | Комментарий. | [optional] 

## Examples

- Prepare the resource
```powershell
$TimePeriodDTO = Initialize-ympa_powershell_clientTimePeriodDTO  -TimePeriod null `
 -TimeUnit null `
 -Comment null
```

- Convert the resource to JSON
```powershell
$TimePeriodDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

