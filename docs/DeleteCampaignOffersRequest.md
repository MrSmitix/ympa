
# Table `DeleteCampaignOffersRequest`
(mapped from: DeleteCampaignOffersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Идентификаторы товаров в каталоге. | 


# **Table `DeleteCampaignOffersRequestOfferIds`**
(mapped from: DeleteCampaignOffersRequestOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteCampaignOffersRequest | deleteCampaignOffersRequest | long | | kotlin.Long | Primary Key | *one*
offerIds | offerIds | text | | kotlin.String | Foreign Key | *many*



