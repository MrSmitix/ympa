
# Table `GetPromoOffersResultDTO`
(mapped from: GetPromoOffersResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GetPromoOfferDTO&gt;**](GetPromoOfferDTO.md) | Товары, которые участвуют или могут участвовать в акции. | 
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetPromoOffersResultDTOGetPromoOfferDTO`**
(mapped from: GetPromoOffersResultDTOGetPromoOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getPromoOffersResultDTO | getPromoOffersResultDTO | long | | kotlin.Long | Primary Key | *one*
getPromoOfferDTO | getPromoOfferDTO | long | | kotlin.Long | Foreign Key | *many*




