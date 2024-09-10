
# Table `GetCampaignsResponse`
(mapped from: GetCampaignsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaigns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignDTO&gt;**](CampaignDTO.md) | Список с информацией по каждому магазину. | 
**pager** | pager | long |  | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetCampaignsResponseCampaignDTO`**
(mapped from: GetCampaignsResponseCampaignDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getCampaignsResponse | getCampaignsResponse | long | | kotlin.Long | Primary Key | *one*
campaignDTO | campaignDTO | long | | kotlin.Long | Foreign Key | *many*




