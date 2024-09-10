
# Table `UpdateOfferMappingsResponse`
(mapped from: UpdateOfferMappingsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long |  | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  |  [optional] [foreignkey]
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateOfferMappingResultDTO&gt;**](UpdateOfferMappingResultDTO.md) | Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  |  [optional]



# **Table `UpdateOfferMappingsResponseUpdateOfferMappingResultDTO`**
(mapped from: UpdateOfferMappingsResponseUpdateOfferMappingResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateOfferMappingsResponse | updateOfferMappingsResponse | long | | kotlin.Long | Primary Key | *one*
updateOfferMappingResultDTO | updateOfferMappingResultDTO | long | | kotlin.Long | Foreign Key | *many*



