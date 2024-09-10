# AddOffersToArchiveResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**AddOffersToArchiveDTO**](AddOffersToArchiveDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AddOffersToArchiveResponse = Initialize-ympa_powershell_clientAddOffersToArchiveResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$AddOffersToArchiveResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

