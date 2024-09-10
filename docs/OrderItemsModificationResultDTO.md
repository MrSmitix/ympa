
# Table `OrderItemsModificationResultDTO`
(mapped from: OrderItemsModificationResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BriefOrderItemDTO&gt;**](BriefOrderItemDTO.md) | Список позиций в заказе, подлежащих маркировке. | 


# **Table `OrderItemsModificationResultDTOBriefOrderItemDTO`**
(mapped from: OrderItemsModificationResultDTOBriefOrderItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderItemsModificationResultDTO | orderItemsModificationResultDTO | long | | kotlin.Long | Primary Key | *one*
briefOrderItemDTO | briefOrderItemDTO | long | | kotlin.Long | Foreign Key | *many*



