# GetHiddenOffersResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**HiddenOffers** | [**HiddenOfferDTO[]**](HiddenOfferDTO.md) | Список скрытых товаров. | 

## Examples

- Prepare the resource
```powershell
$GetHiddenOffersResultDTO = Initialize-ympa_powershell_clientGetHiddenOffersResultDTO  -Paging null `
 -HiddenOffers null
```

- Convert the resource to JSON
```powershell
$GetHiddenOffersResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

