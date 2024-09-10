# GetPromosRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Participation** | [**PromoParticipationType**](PromoParticipationType.md) |  | [optional] 
**Mechanics** | [**MechanicsType**](MechanicsType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPromosRequest = Initialize-ympa_powershell_clientGetPromosRequest  -Participation null `
 -Mechanics null
```

- Convert the resource to JSON
```powershell
$GetPromosRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

