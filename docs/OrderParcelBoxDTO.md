# OrderParcelBoxDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор грузоместа. | [optional] 
**FulfilmentId** | **String** | Идентификатор грузового места в информационной системе магазина. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderParcelBoxDTO = Initialize-ympa_powershell_clientOrderParcelBoxDTO  -Id null `
 -FulfilmentId null
```

- Convert the resource to JSON
```powershell
$OrderParcelBoxDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

