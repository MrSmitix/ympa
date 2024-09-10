# UpdateCampaignOffersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**UpdateCampaignOfferDTO[]**](UpdateCampaignOfferDTO.md) | Параметры размещения товаров в заданном магазине. | 

## Examples

- Prepare the resource
```powershell
$UpdateCampaignOffersRequest = Initialize-ympa_powershell_clientUpdateCampaignOffersRequest  -Offers null
```

- Convert the resource to JSON
```powershell
$UpdateCampaignOffersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

