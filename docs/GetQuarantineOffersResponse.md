# GetQuarantineOffersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GetQuarantineOffersResultDTO**](GetQuarantineOffersResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetQuarantineOffersResponse = Initialize-ympa_powershell_clientGetQuarantineOffersResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetQuarantineOffersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

