# GetCampaignOffersResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**Offers** | [**GetCampaignOfferDTO[]**](GetCampaignOfferDTO.md) | Страница списка товаров. | 

## Examples

- Prepare the resource
```powershell
$GetCampaignOffersResultDTO = Initialize-ympa_powershell_clientGetCampaignOffersResultDTO  -Paging null `
 -Offers null
```

- Convert the resource to JSON
```powershell
$GetCampaignOffersResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

