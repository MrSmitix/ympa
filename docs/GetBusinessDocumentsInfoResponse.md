# GetBusinessDocumentsInfoResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OrderBusinessDocumentsDTO**](OrderBusinessDocumentsDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBusinessDocumentsInfoResponse = Initialize-ympa_powershell_clientGetBusinessDocumentsInfoResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetBusinessDocumentsInfoResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

