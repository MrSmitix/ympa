
# Table `SuggestPricesResultDTO`
(mapped from: SuggestPricesResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PriceSuggestOfferDTO&gt;**](PriceSuggestOfferDTO.md) | Список товаров с ценами для продвижения. | 


# **Table `SuggestPricesResultDTOPriceSuggestOfferDTO`**
(mapped from: SuggestPricesResultDTOPriceSuggestOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
suggestPricesResultDTO | suggestPricesResultDTO | long | | kotlin.Long | Primary Key | *one*
priceSuggestOfferDTO | priceSuggestOfferDTO | long | | kotlin.Long | Foreign Key | *many*



