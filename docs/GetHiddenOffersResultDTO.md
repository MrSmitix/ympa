
# Table `GetHiddenOffersResultDTO`
(mapped from: GetHiddenOffersResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**hiddenOffers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;HiddenOfferDTO&gt;**](HiddenOfferDTO.md) | Список скрытых товаров. | 
**paging** | paging | long |  | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetHiddenOffersResultDTOHiddenOfferDTO`**
(mapped from: GetHiddenOffersResultDTOHiddenOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getHiddenOffersResultDTO | getHiddenOffersResultDTO | long | | kotlin.Long | Primary Key | *one*
hiddenOfferDTO | hiddenOfferDTO | long | | kotlin.Long | Foreign Key | *many*




