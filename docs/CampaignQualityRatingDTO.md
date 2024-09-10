
# Table `CampaignQualityRatingDTO`
(mapped from: CampaignQualityRatingDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignId** | campaignId | long NOT NULL |  | **kotlin.Long** | Идентификатор магазина. | 
**ratings** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;QualityRatingDTO&gt;**](QualityRatingDTO.md) | Список значений индекса качества. | 



# **Table `CampaignQualityRatingDTOQualityRatingDTO`**
(mapped from: CampaignQualityRatingDTOQualityRatingDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignQualityRatingDTO | campaignQualityRatingDTO | long | | kotlin.Long | Primary Key | *one*
qualityRatingDTO | qualityRatingDTO | long | | kotlin.Long | Foreign Key | *many*



