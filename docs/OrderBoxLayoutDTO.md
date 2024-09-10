
# Table `OrderBoxLayoutDTO`
(mapped from: OrderBoxLayoutDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderBoxLayoutItemDTO&gt;**](OrderBoxLayoutItemDTO.md) | Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  | 


# **Table `OrderBoxLayoutDTOOrderBoxLayoutItemDTO`**
(mapped from: OrderBoxLayoutDTOOrderBoxLayoutItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderBoxLayoutDTO | orderBoxLayoutDTO | long | | kotlin.Long | Primary Key | *one*
orderBoxLayoutItemDTO | orderBoxLayoutItemDTO | long | | kotlin.Long | Foreign Key | *many*



