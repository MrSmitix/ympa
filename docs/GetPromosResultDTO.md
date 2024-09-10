
# Table `GetPromosResultDTO`
(mapped from: GetPromosResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**promos** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GetPromoDTO&gt;**](GetPromoDTO.md) | Акции Маркета. | 


# **Table `GetPromosResultDTOGetPromoDTO`**
(mapped from: GetPromosResultDTOGetPromoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getPromosResultDTO | getPromosResultDTO | long | | kotlin.Long | Primary Key | *one*
getPromoDTO | getPromoDTO | long | | kotlin.Long | Foreign Key | *many*



