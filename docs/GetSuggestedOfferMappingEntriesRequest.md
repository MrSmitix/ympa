
# Table `GetSuggestedOfferMappingEntriesRequest`
(mapped from: GetSuggestedOfferMappingEntriesRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MappingsOfferDTO&gt;**](MappingsOfferDTO.md) | Список товаров. | 


# **Table `GetSuggestedOfferMappingEntriesRequestMappingsOfferDTO`**
(mapped from: GetSuggestedOfferMappingEntriesRequestMappingsOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getSuggestedOfferMappingEntriesRequest | getSuggestedOfferMappingEntriesRequest | long | | kotlin.Long | Primary Key | *one*
mappingsOfferDTO | mappingsOfferDTO | long | | kotlin.Long | Foreign Key | *many*



