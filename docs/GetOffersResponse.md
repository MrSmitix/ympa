
# Table `GetOffersResponse`
(mapped from: GetOffersResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferDTO&gt;**](OfferDTO.md) | Список предложений магазина. | 
**pager** | pager | long |  | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetOffersResponseOfferDTO`**
(mapped from: GetOffersResponseOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOffersResponse | getOffersResponse | long | | kotlin.Long | Primary Key | *one*
offerDTO | offerDTO | long | | kotlin.Long | Foreign Key | *many*




