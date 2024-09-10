
# Table `GetOfferMappingsResultDTO`
(mapped from: GetOfferMappingsResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerMappings** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GetOfferMappingDTO&gt;**](GetOfferMappingDTO.md) | Информация о товарах. | 
**paging** | paging | long |  | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetOfferMappingsResultDTOGetOfferMappingDTO`**
(mapped from: GetOfferMappingsResultDTOGetOfferMappingDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOfferMappingsResultDTO | getOfferMappingsResultDTO | long | | kotlin.Long | Primary Key | *one*
getOfferMappingDTO | getOfferMappingDTO | long | | kotlin.Long | Foreign Key | *many*




