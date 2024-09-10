
# Table `OrderBoxesLayoutDTO`
(mapped from: OrderBoxesLayoutDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**boxes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EnrichedOrderBoxLayoutDTO&gt;**](EnrichedOrderBoxLayoutDTO.md) | Список коробок. | 


# **Table `OrderBoxesLayoutDTOEnrichedOrderBoxLayoutDTO`**
(mapped from: OrderBoxesLayoutDTOEnrichedOrderBoxLayoutDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderBoxesLayoutDTO | orderBoxesLayoutDTO | long | | kotlin.Long | Primary Key | *one*
enrichedOrderBoxLayoutDTO | enrichedOrderBoxLayoutDTO | long | | kotlin.Long | Foreign Key | *many*



