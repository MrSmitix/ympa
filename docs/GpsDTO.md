# GpsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Latitude** | **Decimal** | Широта. | 
**Longitude** | **Decimal** | Долгота. | 

## Examples

- Prepare the resource
```powershell
$GpsDTO = Initialize-ympa_powershell_clientGpsDTO  -Latitude null `
 -Longitude null
```

- Convert the resource to JSON
```powershell
$GpsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

