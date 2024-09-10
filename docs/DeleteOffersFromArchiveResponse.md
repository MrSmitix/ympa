# DeleteOffersFromArchiveResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**DeleteOffersFromArchiveDTO**](DeleteOffersFromArchiveDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteOffersFromArchiveResponse = Initialize-ympa_powershell_clientDeleteOffersFromArchiveResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$DeleteOffersFromArchiveResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

