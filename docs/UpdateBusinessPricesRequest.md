
# Table `UpdateBusinessPricesRequest`
(mapped from: UpdateBusinessPricesRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateBusinessOfferPriceDTO&gt;**](UpdateBusinessOfferPriceDTO.md) | Список товаров с ценами. | 


# **Table `UpdateBusinessPricesRequestUpdateBusinessOfferPriceDTO`**
(mapped from: UpdateBusinessPricesRequestUpdateBusinessOfferPriceDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateBusinessPricesRequest | updateBusinessPricesRequest | long | | kotlin.Long | Primary Key | *one*
updateBusinessOfferPriceDTO | updateBusinessOfferPriceDTO | long | | kotlin.Long | Foreign Key | *many*



