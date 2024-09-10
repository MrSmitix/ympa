# CampaignQualityRatingDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **Int64** | Идентификатор магазина. | 
**Ratings** | [**QualityRatingDTO[]**](QualityRatingDTO.md) | Список значений индекса качества. | 

## Examples

- Prepare the resource
```powershell
$CampaignQualityRatingDTO = Initialize-ympa_powershell_clientCampaignQualityRatingDTO  -CampaignId null `
 -Ratings null
```

- Convert the resource to JSON
```powershell
$CampaignQualityRatingDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

