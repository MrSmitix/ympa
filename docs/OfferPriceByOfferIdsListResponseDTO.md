
# Table `OfferPriceByOfferIdsListResponseDTO`
(mapped from: OfferPriceByOfferIdsListResponseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferPriceByOfferIdsResponseDTO&gt;**](OfferPriceByOfferIdsResponseDTO.md) | Страница списка цен. | 
**paging** | paging | long |  | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `OfferPriceByOfferIdsListResponseDTOOfferPriceByOfferIdsResponseDTO`**
(mapped from: OfferPriceByOfferIdsListResponseDTOOfferPriceByOfferIdsResponseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
offerPriceByOfferIdsListResponseDTO | offerPriceByOfferIdsListResponseDTO | long | | kotlin.Long | Primary Key | *one*
offerPriceByOfferIdsResponseDTO | offerPriceByOfferIdsResponseDTO | long | | kotlin.Long | Foreign Key | *many*




