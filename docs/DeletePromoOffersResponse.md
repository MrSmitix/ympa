# DeletePromoOffersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**DeletePromoOffersResultDTO**](DeletePromoOffersResultDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$DeletePromoOffersResponse = Initialize-ympa_powershell_clientDeletePromoOffersResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$DeletePromoOffersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

