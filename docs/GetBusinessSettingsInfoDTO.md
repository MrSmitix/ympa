# GetBusinessSettingsInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Info** | [**BusinessDTO**](BusinessDTO.md) |  | [optional] 
**Settings** | [**BusinessSettingsDTO**](BusinessSettingsDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBusinessSettingsInfoDTO = Initialize-ympa_powershell_clientGetBusinessSettingsInfoDTO  -Info null `
 -Settings null
```

- Convert the resource to JSON
```powershell
$GetBusinessSettingsInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

