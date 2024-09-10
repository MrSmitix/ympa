# GetHiddenOffersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GetHiddenOffersResultDTO**](GetHiddenOffersResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetHiddenOffersResponse = Initialize-ympa_powershell_clientGetHiddenOffersResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetHiddenOffersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

