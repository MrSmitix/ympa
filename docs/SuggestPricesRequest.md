
# Table `SuggestPricesRequest`
(mapped from: SuggestPricesRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SuggestOfferPriceDTO&gt;**](SuggestOfferPriceDTO.md) | Список товаров. | 


# **Table `SuggestPricesRequestSuggestOfferPriceDTO`**
(mapped from: SuggestPricesRequestSuggestOfferPriceDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
suggestPricesRequest | suggestPricesRequest | long | | kotlin.Long | Primary Key | *one*
suggestOfferPriceDTO | suggestOfferPriceDTO | long | | kotlin.Long | Foreign Key | *many*



