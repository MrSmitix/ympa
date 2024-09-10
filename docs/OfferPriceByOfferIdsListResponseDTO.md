# OfferPriceByOfferIdsListResponseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**OfferPriceByOfferIdsResponseDTO[]**](OfferPriceByOfferIdsResponseDTO.md) | Страница списка цен. | 
**Paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferPriceByOfferIdsListResponseDTO = Initialize-ympa_powershell_clientOfferPriceByOfferIdsListResponseDTO  -Offers null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$OfferPriceByOfferIdsListResponseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

