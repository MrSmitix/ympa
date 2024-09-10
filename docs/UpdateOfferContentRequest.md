
# Table `UpdateOfferContentRequest`
(mapped from: UpdateOfferContentRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offersContent** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferContentDTO&gt;**](OfferContentDTO.md) | Список товаров с указанными характеристиками. | 


# **Table `UpdateOfferContentRequestOfferContentDTO`**
(mapped from: UpdateOfferContentRequestOfferContentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateOfferContentRequest | updateOfferContentRequest | long | | kotlin.Long | Primary Key | *one*
offerContentDTO | offerContentDTO | long | | kotlin.Long | Foreign Key | *many*



