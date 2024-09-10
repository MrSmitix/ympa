
# Table `OfferMappingSuggestionsListDTO`
(mapped from: OfferMappingSuggestionsListDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EnrichedMappingsOfferDTO&gt;**](EnrichedMappingsOfferDTO.md) | Список товаров. | 


# **Table `OfferMappingSuggestionsListDTOEnrichedMappingsOfferDTO`**
(mapped from: OfferMappingSuggestionsListDTOEnrichedMappingsOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
offerMappingSuggestionsListDTO | offerMappingSuggestionsListDTO | long | | kotlin.Long | Primary Key | *one*
enrichedMappingsOfferDTO | enrichedMappingsOfferDTO | long | | kotlin.Long | Foreign Key | *many*



