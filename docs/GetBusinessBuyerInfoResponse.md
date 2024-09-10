# GetBusinessBuyerInfoResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OrderBusinessBuyerDTO**](OrderBusinessBuyerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBusinessBuyerInfoResponse = Initialize-ympa_powershell_clientGetBusinessBuyerInfoResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetBusinessBuyerInfoResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

