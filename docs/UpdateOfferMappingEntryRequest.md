
# Table `UpdateOfferMappingEntryRequest`
(mapped from: UpdateOfferMappingEntryRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerMappingEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateOfferMappingEntryDTO&gt;**](UpdateOfferMappingEntryDTO.md) | Информация о товарах в каталоге. | 


# **Table `UpdateOfferMappingEntryRequestUpdateOfferMappingEntryDTO`**
(mapped from: UpdateOfferMappingEntryRequestUpdateOfferMappingEntryDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateOfferMappingEntryRequest | updateOfferMappingEntryRequest | long | | kotlin.Long | Primary Key | *one*
updateOfferMappingEntryDTO | updateOfferMappingEntryDTO | long | | kotlin.Long | Foreign Key | *many*



