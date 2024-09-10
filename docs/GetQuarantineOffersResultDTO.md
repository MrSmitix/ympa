
# Table `GetQuarantineOffersResultDTO`
(mapped from: GetQuarantineOffersResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;QuarantineOfferDTO&gt;**](QuarantineOfferDTO.md) | Страница списка товаров в карантине. | 
**paging** | paging | long |  | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetQuarantineOffersResultDTOQuarantineOfferDTO`**
(mapped from: GetQuarantineOffersResultDTOQuarantineOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getQuarantineOffersResultDTO | getQuarantineOffersResultDTO | long | | kotlin.Long | Primary Key | *one*
quarantineOfferDTO | quarantineOfferDTO | long | | kotlin.Long | Foreign Key | *many*




