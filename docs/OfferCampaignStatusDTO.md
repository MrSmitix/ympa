# OfferCampaignStatusDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **Int64** | Идентификатор кампании.  | 
**Status** | [**OfferCampaignStatusType**](OfferCampaignStatusType.md) |  | 

## Examples

- Prepare the resource
```powershell
$OfferCampaignStatusDTO = Initialize-ympa_powershell_clientOfferCampaignStatusDTO  -CampaignId null `
 -Status null
```

- Convert the resource to JSON
```powershell
$OfferCampaignStatusDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

