
# Table `OrdersStatsDTO`
(mapped from: OrdersStatsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**orders** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrdersStatsOrderDTO&gt;**](OrdersStatsOrderDTO.md) | Список заказов. | 
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `OrdersStatsDTOOrdersStatsOrderDTO`**
(mapped from: OrdersStatsDTOOrdersStatsOrderDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ordersStatsDTO | ordersStatsDTO | long | | kotlin.Long | Primary Key | *one*
ordersStatsOrderDTO | ordersStatsOrderDTO | long | | kotlin.Long | Foreign Key | *many*




