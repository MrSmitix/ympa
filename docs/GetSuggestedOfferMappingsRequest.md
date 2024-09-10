
# Table `GetSuggestedOfferMappingsRequest`
(mapped from: GetSuggestedOfferMappingsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SuggestedOfferDTO&gt;**](SuggestedOfferDTO.md) | Список товаров. |  [optional]


# **Table `GetSuggestedOfferMappingsRequestSuggestedOfferDTO`**
(mapped from: GetSuggestedOfferMappingsRequestSuggestedOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getSuggestedOfferMappingsRequest | getSuggestedOfferMappingsRequest | long | | kotlin.Long | Primary Key | *one*
suggestedOfferDTO | suggestedOfferDTO | long | | kotlin.Long | Foreign Key | *many*



