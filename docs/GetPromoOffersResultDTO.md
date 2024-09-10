# GetPromoOffersResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**GetPromoOfferDTO[]**](GetPromoOfferDTO.md) | Товары, которые участвуют или могут участвовать в акции. | 
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPromoOffersResultDTO = Initialize-ympa_powershell_clientGetPromoOffersResultDTO  -Offers null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$GetPromoOffersResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

