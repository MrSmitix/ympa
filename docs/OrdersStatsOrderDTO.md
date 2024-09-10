# OpenapiClient::OrdersStatsOrderDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор заказа. | [optional] |
| **creation_date** | **Date** | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |
| **status_update_date** | **Time** | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  | [optional] |
| **status** | [**OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional] |
| **partner_order_id** | **String** | Идентификатор заказа в информационной системе магазина. | [optional] |
| **payment_type** | [**OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional] |
| **fake** | **Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] |
| **delivery_region** | [**OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] |
| **items** | [**Array&lt;OrdersStatsItemDTO&gt;**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. |  |
| **initial_items** | [**Array&lt;OrdersStatsItemDTO&gt;**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] |
| **payments** | [**Array&lt;OrdersStatsPaymentDTO&gt;**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. |  |
| **commissions** | [**Array&lt;OrdersStatsCommissionDTO&gt;**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrdersStatsOrderDTO.new(
  id: null,
  creation_date: null,
  status_update_date: null,
  status: null,
  partner_order_id: null,
  payment_type: null,
  fake: null,
  delivery_region: null,
  items: null,
  initial_items: null,
  payments: null,
  commissions: null
)
```

