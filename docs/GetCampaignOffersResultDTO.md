
# Table `GetCampaignOffersResultDTO`
(mapped from: GetCampaignOffersResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GetCampaignOfferDTO&gt;**](GetCampaignOfferDTO.md) | Страница списка товаров. | 
**paging** | paging | long |  | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetCampaignOffersResultDTOGetCampaignOfferDTO`**
(mapped from: GetCampaignOffersResultDTOGetCampaignOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCampaignOffersResultDTO | getCampaignOffersResultDTO | long | | kotlin.Long | Primary Key | *one*
getCampaignOfferDTO | getCampaignOfferDTO | long | | kotlin.Long | Foreign Key | *many*




