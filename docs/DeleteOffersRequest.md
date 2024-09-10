
# Table `DeleteOffersRequest`
(mapped from: DeleteOffersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список SKU товаров, которые нужно удалить. | 


# **Table `DeleteOffersRequestOfferIds`**
(mapped from: DeleteOffersRequestOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteOffersRequest | deleteOffersRequest | long | | kotlin.Long | Primary Key | *one*
offerIds | offerIds | text | | kotlin.String | Foreign Key | *many*



