
# Table `UpdateOrderStatusesRequest`
(mapped from: UpdateOrderStatusesRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**orders** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderStateDTO&gt;**](OrderStateDTO.md) | Список заказов. | 


# **Table `UpdateOrderStatusesRequestOrderStateDTO`**
(mapped from: UpdateOrderStatusesRequestOrderStateDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateOrderStatusesRequest | updateOrderStatusesRequest | long | | kotlin.Long | Primary Key | *one*
orderStateDTO | orderStateDTO | long | | kotlin.Long | Foreign Key | *many*



