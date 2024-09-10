
# Table `PutSkuBidsRequest`
(mapped from: PutSkuBidsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**bids** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SkuBidItemDTO&gt;**](SkuBidItemDTO.md) | Список товаров и ставки для продвижения, которые на них нужно установить. | 


# **Table `PutSkuBidsRequestSkuBidItemDTO`**
(mapped from: PutSkuBidsRequestSkuBidItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
putSkuBidsRequest | putSkuBidsRequest | long | | kotlin.Long | Primary Key | *one*
skuBidItemDTO | skuBidItemDTO | long | | kotlin.Long | Foreign Key | *many*



