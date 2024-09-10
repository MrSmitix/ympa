
# Table `PromoOfferAutoParticipatingDetailsDTO`
(mapped from: PromoOfferAutoParticipatingDetailsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — &#x60;PARTIALLY_AUTO&#x60;.  |  [optional]


# **Table `PromoOfferAutoParticipatingDetailsDTOCampaignIds`**
(mapped from: PromoOfferAutoParticipatingDetailsDTOCampaignIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
promoOfferAutoParticipatingDetailsDTO | promoOfferAutoParticipatingDetailsDTO | long | | kotlin.Long | Primary Key | *one*
campaignIds | campaignIds | long | | kotlin.Long | Foreign Key | *many*



