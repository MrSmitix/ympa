
# Table `DeleteOffersFromArchiveRequest`
(mapped from: DeleteOffersFromArchiveRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список товаров, которые нужно восстановить из архива. | 


# **Table `DeleteOffersFromArchiveRequestOfferIds`**
(mapped from: DeleteOffersFromArchiveRequestOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteOffersFromArchiveRequest | deleteOffersFromArchiveRequest | long | | kotlin.Long | Primary Key | *one*
offerIds | offerIds | text | | kotlin.String | Foreign Key | *many*



