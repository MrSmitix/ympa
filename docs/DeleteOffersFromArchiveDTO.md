
# Table `DeleteOffersFromArchiveDTO`
(mapped from: DeleteOffersFromArchiveDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**notUnarchivedOfferIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список товаров, которые не удалось восстановить из архива. |  [optional]


# **Table `DeleteOffersFromArchiveDTONotUnarchivedOfferIds`**
(mapped from: DeleteOffersFromArchiveDTONotUnarchivedOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteOffersFromArchiveDTO | deleteOffersFromArchiveDTO | long | | kotlin.Long | Primary Key | *one*
notUnarchivedOfferIds | notUnarchivedOfferIds | text | | kotlin.String | Foreign Key | *many*



