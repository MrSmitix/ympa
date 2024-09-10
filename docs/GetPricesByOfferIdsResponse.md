# GetPricesByOfferIdsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | [**OfferPriceByOfferIdsListResponseDTO**](OfferPriceByOfferIdsListResponseDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPricesByOfferIdsResponse = Initialize-ympa_powershell_clientGetPricesByOfferIdsResponse  -Status null `
 -Result null
```

- Convert the resource to JSON
```powershell
$GetPricesByOfferIdsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

