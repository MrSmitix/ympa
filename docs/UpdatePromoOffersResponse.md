# UpdatePromoOffersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**UpdatePromoOffersResultDTO**](UpdatePromoOffersResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdatePromoOffersResponse = Initialize-ympa_powershell_clientUpdatePromoOffersResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$UpdatePromoOffersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

