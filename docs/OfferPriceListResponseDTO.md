# OfferPriceListResponseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**OfferPriceResponseDTO[]**](OfferPriceResponseDTO.md) | Страница списка. | 
**Paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**Total** | **Int32** | Количество всех цен магазина, измененных через API. | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferPriceListResponseDTO = Initialize-ympa_powershell_clientOfferPriceListResponseDTO  -Offers null `
 -Paging null `
 -Total null
```

- Convert the resource to JSON
```powershell
$OfferPriceListResponseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

