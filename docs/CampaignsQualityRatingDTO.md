
# Table `CampaignsQualityRatingDTO`
(mapped from: CampaignsQualityRatingDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignRatings** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignQualityRatingDTO&gt;**](CampaignQualityRatingDTO.md) | Список магазинов c информацией об их индексе качества. | 


# **Table `CampaignsQualityRatingDTOCampaignQualityRatingDTO`**
(mapped from: CampaignsQualityRatingDTOCampaignQualityRatingDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignsQualityRatingDTO | campaignsQualityRatingDTO | long | | kotlin.Long | Primary Key | *one*
campaignQualityRatingDTO | campaignQualityRatingDTO | long | | kotlin.Long | Foreign Key | *many*



