
# Table `ProvideOrderItemIdentifiersRequest`
(mapped from: ProvideOrderItemIdentifiersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderItemInstanceModificationDTO&gt;**](OrderItemInstanceModificationDTO.md) | Список позиций, требующих маркировки.  | 


# **Table `ProvideOrderItemIdentifiersRequestOrderItemInstanceModificationDTO`**
(mapped from: ProvideOrderItemIdentifiersRequestOrderItemInstanceModificationDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
provideOrderItemIdentifiersRequest | provideOrderItemIdentifiersRequest | long | | kotlin.Long | Primary Key | *one*
orderItemInstanceModificationDTO | orderItemInstanceModificationDTO | long | | kotlin.Long | Foreign Key | *many*



