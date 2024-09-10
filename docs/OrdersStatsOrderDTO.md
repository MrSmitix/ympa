
# Table `OrdersStatsOrderDTO`
(mapped from: OrdersStatsOrderDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrdersStatsItemDTO&gt;**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | 
**payments** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrdersStatsPaymentDTO&gt;**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | 
**commissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrdersStatsCommissionDTO&gt;**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | 
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор заказа. |  [optional]
**creationDate** | creationDate | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  |  [optional]
**statusUpdateDate** | statusUpdateDate | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  |  [optional]
**status** | status | long |  | [**OrderStatsStatusType**](OrderStatsStatusType.md) |  |  [optional] [foreignkey]
**partnerOrderId** | partnerOrderId | text |  | **kotlin.String** | Идентификатор заказа в информационной системе магазина. |  [optional]
**paymentType** | paymentType | long |  | [**OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  |  [optional] [foreignkey]
**fake** | fake | boolean |  | **kotlin.Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  |  [optional]
**deliveryRegion** | deliveryRegion | long |  | [**OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  |  [optional] [foreignkey]
**initialItems** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrdersStatsItemDTO&gt;**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. |  [optional]


# **Table `OrdersStatsOrderDTOOrdersStatsItemDTO`**
(mapped from: OrdersStatsOrderDTOOrdersStatsItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ordersStatsOrderDTO | ordersStatsOrderDTO | long | | kotlin.Long | Primary Key | *one*
ordersStatsItemDTO | ordersStatsItemDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `OrdersStatsOrderDTOOrdersStatsPaymentDTO`**
(mapped from: OrdersStatsOrderDTOOrdersStatsPaymentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ordersStatsOrderDTO | ordersStatsOrderDTO | long | | kotlin.Long | Primary Key | *one*
ordersStatsPaymentDTO | ordersStatsPaymentDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `OrdersStatsOrderDTOOrdersStatsCommissionDTO`**
(mapped from: OrdersStatsOrderDTOOrdersStatsCommissionDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ordersStatsOrderDTO | ordersStatsOrderDTO | long | | kotlin.Long | Primary Key | *one*
ordersStatsCommissionDTO | ordersStatsCommissionDTO | long | | kotlin.Long | Foreign Key | *many*











# **Table `OrdersStatsOrderDTOOrdersStatsItemDTO`**
(mapped from: OrdersStatsOrderDTOOrdersStatsItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ordersStatsOrderDTO | ordersStatsOrderDTO | long | | kotlin.Long | Primary Key | *one*
ordersStatsItemDTO | ordersStatsItemDTO | long | | kotlin.Long | Foreign Key | *many*



