# DeleteCampaignOffersDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NotDeletedOfferIds** | **String[]** | Список SKU. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteCampaignOffersDTO = Initialize-ympa_powershell_clientDeleteCampaignOffersDTO  -NotDeletedOfferIds null
```

- Convert the resource to JSON
```powershell
$DeleteCampaignOffersDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

