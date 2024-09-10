
# Table `DeletePromoOffersResultDTO`
(mapped from: DeletePromoOffersResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**rejectedOffers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RejectedPromoOfferDeleteDTO&gt;**](RejectedPromoOfferDeleteDTO.md) | Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  |  [optional]


# **Table `DeletePromoOffersResultDTORejectedPromoOfferDeleteDTO`**
(mapped from: DeletePromoOffersResultDTORejectedPromoOfferDeleteDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deletePromoOffersResultDTO | deletePromoOffersResultDTO | long | | kotlin.Long | Primary Key | *one*
rejectedPromoOfferDeleteDTO | rejectedPromoOfferDeleteDTO | long | | kotlin.Long | Foreign Key | *many*



