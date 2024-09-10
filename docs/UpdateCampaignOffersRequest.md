
# Table `UpdateCampaignOffersRequest`
(mapped from: UpdateCampaignOffersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateCampaignOfferDTO&gt;**](UpdateCampaignOfferDTO.md) | Параметры размещения товаров в заданном магазине. | 


# **Table `UpdateCampaignOffersRequestUpdateCampaignOfferDTO`**
(mapped from: UpdateCampaignOffersRequestUpdateCampaignOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateCampaignOffersRequest | updateCampaignOffersRequest | long | | kotlin.Long | Primary Key | *one*
updateCampaignOfferDTO | updateCampaignOfferDTO | long | | kotlin.Long | Foreign Key | *many*



