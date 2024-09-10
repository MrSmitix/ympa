# CampaignsQualityRatingDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignRatings** | [**CampaignQualityRatingDTO[]**](CampaignQualityRatingDTO.md) | Список магазинов c информацией об их индексе качества. | 

## Examples

- Prepare the resource
```powershell
$CampaignsQualityRatingDTO = Initialize-ympa_powershell_clientCampaignsQualityRatingDTO  -CampaignRatings null
```

- Convert the resource to JSON
```powershell
$CampaignsQualityRatingDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

