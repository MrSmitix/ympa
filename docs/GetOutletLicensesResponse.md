# GetOutletLicensesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OutletLicensesResponseDTO**](OutletLicensesResponseDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetOutletLicensesResponse = Initialize-ympa_powershell_clientGetOutletLicensesResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetOutletLicensesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

