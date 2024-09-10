
# Table `GetOrdersResponse`
(mapped from: GetOrdersResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**orders** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderDTO&gt;**](OrderDTO.md) | Модель заказа.  | 
**pager** | pager | long |  | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  |  [optional] [foreignkey]
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetOrdersResponseOrderDTO`**
(mapped from: GetOrdersResponseOrderDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOrdersResponse | getOrdersResponse | long | | kotlin.Long | Primary Key | *one*
orderDTO | orderDTO | long | | kotlin.Long | Foreign Key | *many*





