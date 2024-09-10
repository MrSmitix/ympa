
# Table `AddOffersToArchiveRequest`
(mapped from: AddOffersToArchiveRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список товаров, которые нужно поместить в архив. | 


# **Table `AddOffersToArchiveRequestOfferIds`**
(mapped from: AddOffersToArchiveRequestOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
addOffersToArchiveRequest | addOffersToArchiveRequest | long | | kotlin.Long | Primary Key | *one*
offerIds | offerIds | text | | kotlin.String | Foreign Key | *many*



