# GetPricesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OfferPriceListResponseDTO**](OfferPriceListResponseDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPricesResponse = Initialize-ympa_powershell_clientGetPricesResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetPricesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

