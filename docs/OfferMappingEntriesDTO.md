
# Table `OfferMappingEntriesDTO`
(mapped from: OfferMappingEntriesDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerMappingEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferMappingEntryDTO&gt;**](OfferMappingEntryDTO.md) | Информация о товарах в каталоге. | 
**paging** | paging | long |  | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `OfferMappingEntriesDTOOfferMappingEntryDTO`**
(mapped from: OfferMappingEntriesDTOOfferMappingEntryDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
offerMappingEntriesDTO | offerMappingEntriesDTO | long | | kotlin.Long | Primary Key | *one*
offerMappingEntryDTO | offerMappingEntryDTO | long | | kotlin.Long | Foreign Key | *many*




