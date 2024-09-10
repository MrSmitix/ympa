
# Table `ConfirmPricesRequest`
(mapped from: ConfirmPricesRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Идентификаторы товаров, у которых подтверждается цена. | 


# **Table `ConfirmPricesRequestOfferIds`**
(mapped from: ConfirmPricesRequestOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
confirmPricesRequest | confirmPricesRequest | long | | kotlin.Long | Primary Key | *one*
offerIds | offerIds | text | | kotlin.String | Foreign Key | *many*



