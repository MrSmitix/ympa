# OrderBoxLayoutPartialCountDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Current** | **Int32** | Номер части, начиная с 1. | 
**Total** | **Int32** | На сколько всего частей разделен товар. | 

## Examples

- Prepare the resource
```powershell
$OrderBoxLayoutPartialCountDTO = Initialize-ympa_powershell_clientOrderBoxLayoutPartialCountDTO  -Current null `
 -Total null
```

- Convert the resource to JSON
```powershell
$OrderBoxLayoutPartialCountDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

