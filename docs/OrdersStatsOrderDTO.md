
# OrdersStatsOrderDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **items** | [**kotlin.collections.List&lt;OrdersStatsItemDTO&gt;**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. |  |
| **payments** | [**kotlin.collections.List&lt;OrdersStatsPaymentDTO&gt;**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. |  |
| **commissions** | [**kotlin.collections.List&lt;OrdersStatsCommissionDTO&gt;**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. |  |
| **id** | **kotlin.Long** | Идентификатор заказа. |  [optional] |
| **creationDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  |  [optional] |
| **statusUpdateDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  |  [optional] |
| **status** | [**OrderStatsStatusType**](OrderStatsStatusType.md) |  |  [optional] |
| **partnerOrderId** | **kotlin.String** | Идентификатор заказа в информационной системе магазина. |  [optional] |
| **paymentType** | [**OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  |  [optional] |
| **fake** | **kotlin.Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  |  [optional] |
| **deliveryRegion** | [**OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  |  [optional] |
| **initialItems** | [**kotlin.collections.List&lt;OrdersStatsItemDTO&gt;**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. |  [optional] |



