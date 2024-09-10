
# Table `OfferPriceListResponseDTO`
(mapped from: OfferPriceListResponseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferPriceResponseDTO&gt;**](OfferPriceResponseDTO.md) | Страница списка. | 
**paging** | paging | long |  | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  |  [optional] [foreignkey]
**total** | total | int |  | **kotlin.Int** | Количество всех цен магазина, измененных через API. |  [optional]


# **Table `OfferPriceListResponseDTOOfferPriceResponseDTO`**
(mapped from: OfferPriceListResponseDTOOfferPriceResponseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
offerPriceListResponseDTO | offerPriceListResponseDTO | long | | kotlin.Long | Primary Key | *one*
offerPriceResponseDTO | offerPriceResponseDTO | long | | kotlin.Long | Foreign Key | *many*





