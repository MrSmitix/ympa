# GetBusinessSettingsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GetBusinessSettingsInfoDTO**](GetBusinessSettingsInfoDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBusinessSettingsResponse = Initialize-ympa_powershell_clientGetBusinessSettingsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetBusinessSettingsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

