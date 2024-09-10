# WarehouseAddressDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**City** | **String** | Город. | 
**Street** | **String** | Улица. | [optional] 
**Number** | **String** | Номер дома. | [optional] 
**Building** | **String** | Номер строения. | [optional] 
**Block** | **String** | Номер корпуса. | [optional] 
**Gps** | [**GpsDTO**](GpsDTO.md) |  | 

## Examples

- Prepare the resource
```powershell
$WarehouseAddressDTO = Initialize-ympa_powershell_clientWarehouseAddressDTO  -City null `
 -Street null `
 -Number null `
 -Building null `
 -Block null `
 -Gps null
```

- Convert the resource to JSON
```powershell
$WarehouseAddressDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

