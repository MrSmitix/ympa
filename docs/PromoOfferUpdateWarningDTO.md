
# Table `PromoOfferUpdateWarningDTO`
(mapped from: PromoOfferUpdateWarningDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**code** | code | long NOT NULL |  | [**PromoOfferUpdateWarningCodeType**](PromoOfferUpdateWarningCodeType.md) |  |  [foreignkey]
**campaignIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете.  |  [optional]



# **Table `PromoOfferUpdateWarningDTOCampaignIds`**
(mapped from: PromoOfferUpdateWarningDTOCampaignIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
promoOfferUpdateWarningDTO | promoOfferUpdateWarningDTO | long | | kotlin.Long | Primary Key | *one*
campaignIds | campaignIds | long | | kotlin.Long | Foreign Key | *many*



