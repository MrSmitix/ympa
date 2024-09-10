
# Table `DeleteCampaignOffersDTO`
(mapped from: DeleteCampaignOffersDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**notDeletedOfferIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список SKU. |  [optional]


# **Table `DeleteCampaignOffersDTONotDeletedOfferIds`**
(mapped from: DeleteCampaignOffersDTONotDeletedOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteCampaignOffersDTO | deleteCampaignOffersDTO | long | | kotlin.Long | Primary Key | *one*
notDeletedOfferIds | notDeletedOfferIds | text | | kotlin.String | Foreign Key | *many*



