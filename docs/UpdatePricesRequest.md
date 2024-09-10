
# Table `UpdatePricesRequest`
(mapped from: UpdatePricesRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferPriceDTO&gt;**](OfferPriceDTO.md) | Список товаров. | 


# **Table `UpdatePricesRequestOfferPriceDTO`**
(mapped from: UpdatePricesRequestOfferPriceDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updatePricesRequest | updatePricesRequest | long | | kotlin.Long | Primary Key | *one*
offerPriceDTO | offerPriceDTO | long | | kotlin.Long | Foreign Key | *many*



