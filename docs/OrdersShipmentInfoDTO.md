
# Table `OrdersShipmentInfoDTO`
(mapped from: OrdersShipmentInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**orderIdsWithLabels** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки. | 
**orderIdsWithoutLabels** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки. | 


# **Table `OrdersShipmentInfoDTOOrderIdsWithLabels`**
(mapped from: OrdersShipmentInfoDTOOrderIdsWithLabels)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ordersShipmentInfoDTO | ordersShipmentInfoDTO | long | | kotlin.Long | Primary Key | *one*
orderIdsWithLabels | orderIdsWithLabels | long | | kotlin.Long | Foreign Key | *many*



# **Table `OrdersShipmentInfoDTOOrderIdsWithoutLabels`**
(mapped from: OrdersShipmentInfoDTOOrderIdsWithoutLabels)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ordersShipmentInfoDTO | ordersShipmentInfoDTO | long | | kotlin.Long | Primary Key | *one*
orderIdsWithoutLabels | orderIdsWithoutLabels | long | | kotlin.Long | Foreign Key | *many*



