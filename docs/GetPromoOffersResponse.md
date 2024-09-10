# GetPromoOffersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**GetPromoOffersResultDTO**](GetPromoOffersResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPromoOffersResponse = Initialize-ympa_powershell_clientGetPromoOffersResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetPromoOffersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

