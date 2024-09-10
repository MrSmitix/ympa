# CreateOutletResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OutletResponseDTO**](OutletResponseDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateOutletResponse = Initialize-ympa_powershell_clientCreateOutletResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$CreateOutletResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

