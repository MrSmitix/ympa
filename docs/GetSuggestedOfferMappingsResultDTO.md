
# Table `GetSuggestedOfferMappingsResultDTO`
(mapped from: GetSuggestedOfferMappingsResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SuggestedOfferMappingDTO&gt;**](SuggestedOfferMappingDTO.md) | Список товаров. | 


# **Table `GetSuggestedOfferMappingsResultDTOSuggestedOfferMappingDTO`**
(mapped from: GetSuggestedOfferMappingsResultDTOSuggestedOfferMappingDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getSuggestedOfferMappingsResultDTO | getSuggestedOfferMappingsResultDTO | long | | kotlin.Long | Primary Key | *one*
suggestedOfferMappingDTO | suggestedOfferMappingDTO | long | | kotlin.Long | Foreign Key | *many*



