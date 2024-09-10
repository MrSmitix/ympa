
# Table `UpdateOrderStatusesDTO`
(mapped from: UpdateOrderStatusesDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**orders** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateOrderStatusDTO&gt;**](UpdateOrderStatusDTO.md) | Список с обновленными заказами. | 


# **Table `UpdateOrderStatusesDTOUpdateOrderStatusDTO`**
(mapped from: UpdateOrderStatusesDTOUpdateOrderStatusDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateOrderStatusesDTO | updateOrderStatusesDTO | long | | kotlin.Long | Primary Key | *one*
updateOrderStatusDTO | updateOrderStatusDTO | long | | kotlin.Long | Foreign Key | *many*



