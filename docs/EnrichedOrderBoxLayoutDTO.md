
# Table `EnrichedOrderBoxLayoutDTO`
(mapped from: EnrichedOrderBoxLayoutDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderBoxLayoutItemDTO&gt;**](OrderBoxLayoutItemDTO.md) | Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  | 
**boxId** | boxId | long |  | **kotlin.Long** | Идентификатор коробки. |  [optional]


# **Table `EnrichedOrderBoxLayoutDTOOrderBoxLayoutItemDTO`**
(mapped from: EnrichedOrderBoxLayoutDTOOrderBoxLayoutItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
enrichedOrderBoxLayoutDTO | enrichedOrderBoxLayoutDTO | long | | kotlin.Long | Primary Key | *one*
orderBoxLayoutItemDTO | orderBoxLayoutItemDTO | long | | kotlin.Long | Foreign Key | *many*




