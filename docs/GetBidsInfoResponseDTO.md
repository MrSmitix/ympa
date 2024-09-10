
# Table `GetBidsInfoResponseDTO`
(mapped from: GetBidsInfoResponseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**bids** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SkuBidItemDTO&gt;**](SkuBidItemDTO.md) | Страница списка товаров. | 
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetBidsInfoResponseDTOSkuBidItemDTO`**
(mapped from: GetBidsInfoResponseDTOSkuBidItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getBidsInfoResponseDTO | getBidsInfoResponseDTO | long | | kotlin.Long | Primary Key | *one*
skuBidItemDTO | skuBidItemDTO | long | | kotlin.Long | Foreign Key | *many*




