
# Table `DeleteOffersDTO`
(mapped from: DeleteOffersDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**notDeletedOfferIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список SKU товаров, которые не удалось удалить. |  [optional]


# **Table `DeleteOffersDTONotDeletedOfferIds`**
(mapped from: DeleteOffersDTONotDeletedOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteOffersDTO | deleteOffersDTO | long | | kotlin.Long | Primary Key | *one*
notDeletedOfferIds | notDeletedOfferIds | text | | kotlin.String | Foreign Key | *many*



